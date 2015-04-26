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
package kr.simula.formula.core.wrapper;

import java.util.List;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.ref.GettableRef;
import kr.simula.formula.core.ref.TypeLateBinding;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @param <T>
 * @since 1.0
 */
public class ClosureCallWrapper<T> extends AbstractNode implements Gettable<T>, TypeLateBinding<T> {
	protected final GettableRef<Function<?>> closureRef;
	protected final Gettable<?>[] args;
	private Class<? extends T> type;
	
	/**
	 * @param closureRef
	 * @param args
	 */
	public ClosureCallWrapper(GettableRef<Function<?>> closureRef, Gettable<?>[] args) {
		this.closureRef = closureRef;
		this.args = args;
	}
	
//	@Override
//	public ValueType valueType() {
//		return ValueTypeUtils.getValueType(type);
//	}
	
	public String getToken() {
		return GrammarTokens.FUNC_CALL;
	};
	
	@Override
	public Class<? extends T> type() {
		return type;
	}
	
	@Override
	public void setRequiredType(Class<? extends T> requiredType) {
		this.type = requiredType;
	}

	protected String getFunctionName(){
		return closureRef.qualifiedName().getName();
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("(").append(closureRef);
		for(Gettable<?> n : args){
			buf.append(" ").append(n.getExpression());
		}
		buf.append(")");
		
		return buf.toString();
	}
	
	@Override
	public T get(Context context) {
		@SuppressWarnings("unchecked")
		Function<T> function = (Function<T>)closureRef.get(context);
		
		if(function != null){
			if( function instanceof FunctionSpi){
				return evalLocalFunction((FunctionSpi<T>)function, context);
			} else {
				return evalBuiltInFunction(function, context);
			}
		} else {
			throw new EvalException(closureRef, closureRef + " is not registered.");
		}
	}
	
	protected T evalLocalFunction(FunctionSpi<T> localFn, Context context){
		List<Ref> argDecls = localFn.getArgs();
		int length = argDecls.size();
		
		if(args.length != length){
			throw new EvalException(this, closureRef.qualifiedName().getName() + " has " + args.length + " args."
					+ " But original function needs " + length + "args.");
		}
		Ref argD;
		Object argV;
		
		for(int i=0;i<length;i++){
			argD = argDecls.get(i);
			argV = args[i].get(context);
			context.setReference(argD.qualifiedName(), argV);
		}

		return localFn.evalFunc(context);
	}
	

	protected T evalBuiltInFunction(Function<T> function, Context context){
		int length = args.length;
		
		Object[] arguments = new Object[length];
		
		for(int i=0;i<length;i++){
			arguments[i] = args[i].get(context);
		}

		return function.eval(arguments);
	}
}
