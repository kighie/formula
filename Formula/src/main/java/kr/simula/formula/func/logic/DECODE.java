/* ******************************************************************************
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
package kr.simula.formula.func.logic;

import kr.simula.formula.core.annotation.Arguments;
import kr.simula.formula.core.annotation.FunctionBuild;
import kr.simula.formula.func.AbstractFunction;

/**
 * <pre>
 * a := DECODE (varA, 1, 'returns A', 3, 'returns B', 10, 'returns C' ... );
 * 
 * This class does not work. Just mark up.
 * {@link DecodeFunctionCallWrapper} really works .
 * </pre>
 * @author Ikchan Kwon
 *
 */
@FunctionBuild(factory=DecodeFunctionCallFactory.class)
public class DECODE extends AbstractFunction<Object>  {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param returnType
	 */
	public DECODE() {
		super(Object.class);
	}

	@Override
	@Arguments({ Object.class, Object.class, Object.class })
	public Object eval(Object... args) {
		// DO NOTHING : Real work 
		return null;
	}
}
