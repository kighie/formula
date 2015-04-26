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
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.wrapper.FunctionCallWrapper;

public class BooleanFunctionCallFactory extends GenericFunctionCallFactory {

	/**
	 * @param function
	 * @param validators
	 * @param bArgsLateEval
	 */
	public BooleanFunctionCallFactory(Function<?> function,
			ArgumentValidator<?>[] validators, boolean bArgsLateEval) {
		super(function, validators, bArgsLateEval);
	}


	@SuppressWarnings("unchecked")
	@Override
	protected BooleanFunctionCallWrapper createImpl(Function<?> function, Gettable<?>[] gettables) {
		if( !Boolean.class.isAssignableFrom(function.getReturnType()) ){
			throw new BuildException("Function " + functionName() + "'s return type must be Boolean.");
		}
		return new BooleanFunctionCallWrapper((Function<Boolean>)function, gettables);
	}
	

	public static class BooleanFunctionCallWrapper extends FunctionCallWrapper<Boolean> {
		/**
		 * @param function
		 * @param args
		 */
		public BooleanFunctionCallWrapper(Function<Boolean> function,
				Gettable<?>[] args) {
			super(function, args);
		}
		
//		@Override
//		public ValueType valueType() {
//			return ValueType.LOGICAL;
//		}
		
	}

}