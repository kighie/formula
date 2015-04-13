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
	public LocalFunctionCallWrapper(Function<T> function, Gettable<?>[] args) {
		super(function, args);
		valueType = ValueTypeUtils.getValueType(function.getReturnType());
	}
	
	@Override
	public ValueType valueType() {
		return valueType;
	}
	
	@Override
	public T get(Context context) {
		if(function instanceof LocalFunction){
			LocalFunction<T> localFn = (LocalFunction<T>)function;
			List<Ref> argDecls = localFn.getArgs();
			int length = argDecls.size();
			Ref argD;
			Object argV;
			
			for(int i=0;i<length;i++){
				argD = argDecls.get(i);
				argV = args[i].get(context);
				context.setReference(argD.qualifiedName(), argV);
			}

			localFn.eval(context);
			return localFn.getReturnValue(context);
		} else {
			return super.get(context);
		}
	}
}
