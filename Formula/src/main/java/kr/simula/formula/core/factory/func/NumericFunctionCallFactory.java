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

import java.math.BigDecimal;

import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.wrapper.FunctionCallWrapper;

public class NumericFunctionCallFactory extends GenericFunctionCallFactory {

	/**
	 * @param function
	 * @param validators
	 * @param bArgsLateEval
	 */
	public NumericFunctionCallFactory(Function<?> function,
			ArgumentValidator<?>[] validators, boolean bArgsLateEval) {
		super(function, validators, bArgsLateEval);
	}

//	/**
//	 * @param function
//	 * @param validators
//	 * @param requiredArgCount
//	 */
//	public NumericFunctionCallFactory(Function<?> function,
//			ArgumentValidator<?>[] validators, int requiredArgCount) {
//		super(function, validators, requiredArgCount);
//	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected NumericFunctionCallWrapper createImpl(Function<?> function, Gettable<?>[] gettables) {
		if( !BigDecimal.class.isAssignableFrom(function.getReturnType()) ){
			throw new BuildException("Function " + functionName() + "'s return type must be BigDecimal.");
		}
		return new NumericFunctionCallWrapper((Function<BigDecimal>)function, gettables);
	}
	

	public static class NumericFunctionCallWrapper extends FunctionCallWrapper<BigDecimal> {
		/**
		 * @param function
		 * @param args
		 */
		public NumericFunctionCallWrapper(Function<BigDecimal> function,
				Gettable<?>[] args) {
			super(function, args);
		}
		
//		@Override
//		public ValueType valueType() {
//			return ValueType.NUMERIC;
//		}
		
	}
	
}