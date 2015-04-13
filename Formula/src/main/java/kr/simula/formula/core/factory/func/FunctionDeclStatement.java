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
import kr.simula.formula.core.Statement;
import kr.simula.formula.core.wrapper.LocalFunction;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class FunctionDeclStatement implements BlockStatement {
	private final LocalFunction<?> localFunction;
	
	/**
	 * @param retType
	 * @param name
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public FunctionDeclStatement(Class<?> retType, String name, List<Ref> args) {
		localFunction = new LocalFunction(retType, name, args);
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

	@Override
	public ValueType valueType() {
		return localFunction.valueType();
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
		
		// TODO 
		return buf.toString();
	}

	@Override
	public void append(Statement node) {
		localFunction.append(node);
	}

}
