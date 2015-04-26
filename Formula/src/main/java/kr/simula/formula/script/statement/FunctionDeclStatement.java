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

import java.util.List;

import kr.simula.formula.core.BlockStatement;
import kr.simula.formula.core.Context;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.Statement;
import kr.simula.formula.core.wrapper.AbstractNode;
import kr.simula.formula.core.wrapper.LocalFunction;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class FunctionDeclStatement extends AbstractNode implements BlockStatement {
	private final LocalFunction<?> localFunction;
	private final QName returnValueKey;
	
	/**
	 * @param retType
	 * @param name
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public FunctionDeclStatement(Class<?> retType, String name, List<Ref> args) {
		returnValueKey = new QName("RTN:" + hashCode());
		localFunction = new LocalFunction(retType, name, args, returnValueKey);
	}


	@Override
	public String getToken() {
		return GrammarTokens.FUNC_DECL;
	}
	
	/**
	 * @return the localFunction
	 */
	public LocalFunction<?> getLocalFunction() {
		return localFunction;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return localFunction.getName();
	}

//	@Override
//	public ValueType valueType() {
//		return localFunction.valueType();
//	}

	/**
	 * @return the returnValueKey
	 */
	public QName getReturnValueKey() {
		return returnValueKey;
	}
	
	/**
	 * <pre>
	 * DO NOTHING
	 * </pre>
	 * @param context
	 */
	@Override
	public void eval(Context context) {
		// DO NOTHING
	}

	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("[fn-def ");
		buf.append(localFunction.getExpression());
		buf.append("]");
		
		return buf.toString();
	}

	@Override
	public void append(Statement node) {
		localFunction.append(node);
	}

}
