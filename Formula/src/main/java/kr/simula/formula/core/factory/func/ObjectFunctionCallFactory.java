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
package kr.simula.formula.core.factory.func;

import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.wrapper.FunctionCallWrapper;

public class ObjectFunctionCallFactory extends GenericFunctionCallFactory {



	/**
	 * @param function
	 * @param validators
	 * @param bArgsLateEval
	 */
	public ObjectFunctionCallFactory(Function<?> function,
			ArgumentValidator<?>[] validators, boolean bArgsLateEval) {
		super(function, validators, bArgsLateEval);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	protected ObjectFunctionCallWrapper createImpl(Function<?> function, Gettable<?>[] gettables) {
		return new ObjectFunctionCallWrapper((Function<Object>)function, gettables);
	}
	

	public static class ObjectFunctionCallWrapper extends FunctionCallWrapper<Object> {
		/**
		 * @param function
		 * @param args
		 */
		public ObjectFunctionCallWrapper(Function<Object> function,
				Gettable<?>[] args) {
			super(function, args);
		}
		
//		@Override
//		public ValueType valueType() {
//			return ValueType.OBJECT;
//		}
		
	}
	
}