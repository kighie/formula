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
package kr.simula.formula.script.statement;

import java.util.LinkedList;
import java.util.List;

import kr.simula.formula.core.Block;
import kr.simula.formula.core.Context;
import kr.simula.formula.core.Statement;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractBlockStatement extends AbstractStatement implements Block {
	private List<Statement> stmtList = new LinkedList<Statement>();
	
	@Override
	public void append(Statement node) {
		stmtList.add(node);
	}
	
	protected void getBodyExpression(StringBuilder buf ) {
		for(Statement stmt : stmtList){
			buf.append(stmt.getExpression()).append("\n");
		}
	}
	
	protected void evalBody(Context context){
		for(Statement stmt : stmtList){
			stmt.eval(context);
		}
	}

}
