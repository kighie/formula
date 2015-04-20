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
package kr.simula.formula.func.statics;

import java.math.BigDecimal;

import kr.simula.formula.core.annotation.Arguments;
import kr.simula.formula.core.util.ArrayUtils;
import kr.simula.formula.func.NumericFunction;
import kr.simula.formula.func.base.StatisticalFunctions;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class AVERAGE extends NumericFunction {
	private static final long serialVersionUID = 1L;

	@Override
	@Arguments({BigDecimal[].class})
	public BigDecimal eval(Object... args) {
		checkArgCountMoreThan(args, 0);
		
		BigDecimal[] numArr = ArrayUtils.copyOf(args, BigDecimal[].class);
		return StatisticalFunctions.average(REAL_MATH_CONTEXT, numArr);
	}
}
