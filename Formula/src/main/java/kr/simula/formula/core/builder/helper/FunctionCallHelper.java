/* 
 * Copyright (c) 2012 IkChan Kwon kighie@gmail.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kr.simula.formula.core.builder.helper;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.annotation.Arguments;
import kr.simula.formula.core.annotation.FunctionBuild;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.factory.FunctionCallFactory;
import kr.simula.formula.core.factory.func.ArgumentValidator;
import kr.simula.formula.core.factory.func.BooleanFunctionCallFactory;
import kr.simula.formula.core.factory.func.ClosureCallFactory;
import kr.simula.formula.core.factory.func.DateFunctionCallFactory;
import kr.simula.formula.core.factory.func.LocalFunctionCallFactory;
import kr.simula.formula.core.factory.func.NumericFunctionCallFactory;
import kr.simula.formula.core.factory.func.ObjectFunctionCallFactory;
import kr.simula.formula.core.factory.func.StringFunctionCallFactory;
import kr.simula.formula.core.ref.ClosureRef;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class FunctionCallHelper extends AbstractHelper<FunctionCallFactory> {

	private static Logger logger = Logger.getLogger(FunctionLoader.class.getName());

	protected static final Class<?>[] EMPTY_CLASS_ARRAY = new Class<?>[0];

	protected static final Node[] EMPTY_NODE_ARRAY = new Node[0];
	protected static final ArgumentValidator<?>[] EMPTY_VALIDATOR_ARRAY = new ArgumentValidator<?>[0];

	@SuppressWarnings("rawtypes")
	protected final static Class[] FACTORY_ARG_TYPES = new Class[]{Function.class, 
		ArgumentValidator[].class, boolean.class};

	protected FunctionCallFactory localFunctionCallFactory;

	protected FunctionCallFactory closureCallFactory;
	
	protected Map<Class<?>, ArgumentValidator<?>> validatorMap;
	
	/**
	 * 
	 */
	public FunctionCallHelper() {
		super();
	}
	
	@Override
	protected void initDefaults() {
		localFunctionCallFactory = initLocalFunctionCallFactory();
		closureCallFactory = initClosureCallFactory();
		super.initDefaults();
		initValidators();
	}
	
	/**
	 * @return the closureCallFactory
	 */
	protected FunctionCallFactory initClosureCallFactory() {
		return new ClosureCallFactory();
	}
	
	/**<pre>
	 * </pre>
	 */
	protected FunctionCallFactory initLocalFunctionCallFactory() {
		return new LocalFunctionCallFactory();
	}
	
	protected void initValidators(){
		validatorMap = new HashMap<Class<?>, ArgumentValidator<?>>();
		setValidator(BigDecimal.class, ArgumentValidator.DECIMAL_VALIDATOR);
		setValidator(String.class, ArgumentValidator.STRING_VALIDATOR);
		setValidator(Boolean.class, ArgumentValidator.BOOLEAN_VALIDATOR);
		setValidator(Date.class, ArgumentValidator.DATE_VALIDATOR);
	}
	
	protected void setValidator(Class<?> argType, ArgumentValidator<?> validator){
		validatorMap.put(argType, validator);
	}
	
	protected ArgumentValidator<?> getValidator(Class<?> argType) {
		ArgumentValidator<?> validator = validatorMap.get(argType);
		return validator == null ? ArgumentValidator.OBJECT_VALIDATOR : validator;
	}

	protected FunctionCallFactory getLocalFunctionCallFactory() {
		return localFunctionCallFactory;
	}

	protected void setLocalFunctionCallFactory(
			FunctionCallFactory localFunctionCallFactory) {
		this.localFunctionCallFactory = localFunctionCallFactory;
	}

	/**<pre>
	 * </pre>
	 * @param argTypes
	 * @return
	 */
	private ArgumentValidator<?>[] createValidators(Class<?>[] argTypes) {
		if( argTypes.length == 0 ){
			return EMPTY_VALIDATOR_ARRAY;
		}
		
		int length = argTypes.length;
		ArgumentValidator<?>[] validators = new ArgumentValidator<?>[length];
		Class<?>type;
		for(int i=0;i<length;i++){
			type = argTypes[i];
			if(BigDecimal.class.isAssignableFrom(type)){
				validators[i] = ArgumentValidator.DECIMAL_VALIDATOR;
			} else if(String.class.isAssignableFrom(type)){
				validators[i] = ArgumentValidator.STRING_VALIDATOR;
			} else if(Boolean.class.isAssignableFrom(type)){
				validators[i] = ArgumentValidator.BOOLEAN_VALIDATOR;
			} else if(Date.class.isAssignableFrom(type)){
				validators[i] = ArgumentValidator.DATE_VALIDATOR;
			} else {
				validators[i] = ArgumentValidator.OBJECT_VALIDATOR;
			}
		}
		
		return validators;
	}
	
	protected void loadAndRegisterFunctions(ClassLoader parent, String packageName) {
		try {
			for (Function<?> function : loadFunctions(this.getClass().getClassLoader(), packageName)) {
				registerFunction(function);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected List<Function<?>> loadFunctions(ClassLoader parent, String packageName) throws IOException {
		FunctionLoader loader = new FunctionLoader(parent, packageName);
		return loader.loadFunctions();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected Class<?>[] getArgTypes(Function<?> function) {
		Class<Function> fnClz = (Class<Function>)function.getClass();
		Class<?>[] argTypes;
		Arguments args = null;
		args = fnClz.getAnnotation(Arguments.class);
		
		if(args != null){
			argTypes = args.value();
		} else {
			try {
				Method method = fnClz.getDeclaredMethod("eval", Object[].class);
				args = method.getAnnotation(Arguments.class);
				
				if(args != null){
					argTypes = args.value();
				} else {
					argTypes = EMPTY_CLASS_ARRAY;
				}
			} catch (SecurityException e) {
				logger.log(Level.SEVERE, "Cannot find Function.eval method args.", e);
				argTypes = EMPTY_CLASS_ARRAY;
			} catch (NoSuchMethodException e) {
				logger.log(Level.SEVERE, "Cannot find Function.eval method args.", e);
				argTypes = EMPTY_CLASS_ARRAY;
			}
		}
		
		
		return argTypes;
	}
	/**
	 * <pre>
	 * Creates FunctionCallFactory for function and register it.
	 * </pre>
	 * @param function
	 */
	public void registerFunction(Function<?> function) {
		String fnName = function.getClass().getSimpleName();
		Class<?> returnType = function.getReturnType();
		Class<?>[] argTypes = getArgTypes(function);
		
		FunctionCallFactory factory = createFactory(returnType, function, argTypes);
		
		factories.put(fnName, factory);
		logger.log(Level.WARNING, "Register Function " + function.getClass().getName() + " for " + function.getClass().getSimpleName() );
	}
	
	/**<pre>
	 * </pre>
	 * @param returnType
	 * @param function
	 * @param argTypes
	 * @return
	 */
	protected FunctionCallFactory createFactory(Class<?> returnType,
			Function<?> function, Class<?>[] argTypes) {
		ArgumentValidator<?>[] validators = createValidators(argTypes);
		
		FunctionCallFactory factory = null;
		boolean bArgsLateEval = false;
		
		FunctionBuild fncBuild = function.getClass().getAnnotation(FunctionBuild.class);
		
		if(fncBuild != null){
			Class<? extends FunctionCallFactory> clz = fncBuild.factory();
			bArgsLateEval = fncBuild.argsLateEval();
			
			if(clz != FunctionCallFactory.class){
				try {
					Constructor<? extends FunctionCallFactory> ctrt = clz.getConstructor(FACTORY_ARG_TYPES);
					factory = ctrt.newInstance(new Object[]{function, validators, bArgsLateEval});
				} catch (Exception e) {
					throw new BuildException("Cannot create FunctionCallFactory(" + clz.getName() +")" , e);
				}
			}
		}
		
		if(factory != null){
			return factory;
		}
		
		if(BigDecimal.class.isAssignableFrom(returnType)) {
			factory = new NumericFunctionCallFactory(function, validators, bArgsLateEval);
		} else if(String.class.isAssignableFrom(returnType)){
			factory = new StringFunctionCallFactory(function, validators, bArgsLateEval);
		} else if(Boolean.class.isAssignableFrom(returnType)){
			factory = new BooleanFunctionCallFactory(function, validators, bArgsLateEval);
		} else if(Date.class.isAssignableFrom(returnType)){
			factory = new DateFunctionCallFactory(function, validators, bArgsLateEval);
		} else {
			factory = new ObjectFunctionCallFactory(function, validators, bArgsLateEval);
		}
		
		return factory;
	}

	public Gettable<?> create(BuildContext context,  String name , List<Node> args){
		FunctionCallFactory factory = null;
		
		Function<?> function = context.getLocalFn(name);
		
		if(function != null){
			factory = localFunctionCallFactory;
		}

		if(factory == null){
			Ref ref = context.getRef(QName.getClosureQName(name));

			if( ref != null && ref instanceof ClosureRef){
				factory = closureCallFactory;
			}
		}
		
		if(factory == null){
			factory = factories.get(name);
		}

		if(factory == null){
			throw new BuildException("Function '" + name + "' is not registered.");
		}
		return factory.create(context, name, args);
	}
}
