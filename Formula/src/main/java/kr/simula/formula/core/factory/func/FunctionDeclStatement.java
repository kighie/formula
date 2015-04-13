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
package kr.simula.formula.core.factory.func;

import java.util.List;

import kr.simula.formula.core.BlockStatement;
import kr.simula.formula.core.Context;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.wrapper.AbstractBlock;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class FunctionDeclStatement extends AbstractBlock implements BlockStatement {
	private Class<?> retType;
	private String name;
	private List<Ref> args;
	
	@Override
	public void eval(Context context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		
		// TODO 
		return buf.toString();
	}

}
