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

import java.util.List;

import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.factory.FunctionCallFactory;
import kr.simula.formula.core.factory.func.ClosureCallFactory;
import kr.simula.formula.core.factory.func.LocalFunctionCallFactory;
import kr.simula.formula.core.ref.ClosureRef;
import kr.simula.formula.core.ref.VariableRef;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class FunctionCallHelper  {

//	private static Logger logger = Logger.getLogger(FunctionLoader.class.getName());

	protected FunctionCallFactory localFunctionCallFactory;

	protected FunctionCallFactory closureCallFactory;
	
	protected BuiltInFunctionRegistry globalFunctionRegistry;
	
	/**
	 * 
	 */
	public FunctionCallHelper() {
		initDefaults();
	}
	
	protected final void initDefaults() {
		localFunctionCallFactory = initLocalFunctionCallFactory();
		closureCallFactory = initClosureCallFactory();
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

	protected FunctionCallFactory getLocalFunctionCallFactory() {
		return localFunctionCallFactory;
	}

	/**<pre>
	 * </pre>
	 * @param globalFunctionRegistry
	 */
	public void setFunctionRegistry(
			BuiltInFunctionRegistry globalFunctionRegistry) {
		this.globalFunctionRegistry = globalFunctionRegistry;
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
			Ref ref = context.getRef(QName.getQName(name));

			if( ref != null && ref instanceof VariableRef){
				if( Function.class.isAssignableFrom(( (VariableRef<?>)ref).type()) ){
					factory = closureCallFactory;
				}
			}
		}
		
		if(factory == null){
			factory = globalFunctionRegistry.getFunctionCallFactory(name);
		}

		if(factory == null){
			throw new BuildException("Function '" + name + "' is not registered.");
		}
		
		return factory.create(context, name, args);
	}

}
