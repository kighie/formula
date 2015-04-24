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
import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.RtException;
import kr.simula.formula.core.util.ValueTypeUtils;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @param <T>
 * @since 1.0
 */
public class LocalFunctionCallWrapper<T> extends FunctionCallWrapper<T> {
	private ValueType valueType;
	
	/**
	 * @param function
	 * @param args
	 */
	public LocalFunctionCallWrapper(LocalFunction<T> function, Gettable<?>[] args) {
		super(function, args);
		valueType = ValueTypeUtils.getValueType(function.getReturnType());
	}
	
	@Override
	public ValueType valueType() {
		return valueType;
	}
	
	@Override
	public T get(Context context) {
		LocalFunction<T> localFn = (LocalFunction<T>)function;
		List<Ref> argDecls = localFn.getArgs();
		int length = argDecls.size();
		Ref argD;
		Object argV;
		
		for(int i=0;i<length;i++){
			argD = argDecls.get(i);
			argV = args[i].get(context);
			
			if( argD.type() == Function.class ) {
				if(argV == null) {
					throw new RtException(localFn.getName() + " argument '" + args[i].getExpression() + "' is not defined.");
				} else if(!(argV instanceof Function)) {
					throw new RtException(localFn.getName() + " argument '" + args[i].getExpression() + "' is not function.");
				}
			}
			context.setReference(argD.qualifiedName(), argV);
		}

		localFn.eval(context);
		return localFn.getReturnValue(context);
	}
	

	protected String getFunctionName(){
		return ((LocalFunction<T>)function).getName();
	}
	
}
