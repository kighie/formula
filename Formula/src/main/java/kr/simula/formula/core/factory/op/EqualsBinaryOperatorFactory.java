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
package kr.simula.formula.core.factory.op;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.Operator.Binary;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.factory.BinaryOperatorFactory;
import kr.simula.formula.core.util.GettableUtils;
import kr.simula.formula.core.wrapper.BinaryOperatorGettable;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class EqualsBinaryOperatorFactory implements BinaryOperatorFactory {
	private Binary<Boolean, Object, Object>operator;
	

	/**
	 * @param operator
	 */
	public EqualsBinaryOperatorFactory(
			Binary<Boolean, Object, Object> operator) {
		this.operator = operator;
	}
	
	@Override
	public Gettable<Boolean> create(BuildContext context, String exprToken, Node operand1, Node operand2) {
		Gettable<?> gettable1 = GettableUtils.checkGettable(operand1);
		Gettable<?> gettable2 = GettableUtils.checkGettable(operand2);
		
		return new EqualsBinaryOperatorGettable(operator, gettable1, gettable2);
	}

	static class EqualsBinaryOperatorGettable extends BinaryOperatorGettable<Boolean, Object, Object> {
		public EqualsBinaryOperatorGettable(
				Binary<Boolean, Object, Object> operator,
				Gettable<? extends Object> operand1,
				Gettable<? extends Object> operand2) {
			super(operator, operand1, operand2);
		}

		private static final long serialVersionUID = 379345873998985187L;

		@Override
		public Class<? extends Boolean> type() {
			return Boolean.class;
		}
		
	}
}
