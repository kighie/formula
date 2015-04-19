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
package kr.simula.formula.script.build;

import java.util.List;

import kr.simula.formula.core.BlockStatement;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.helper.DeclarationHelper;
import kr.simula.formula.core.factory.DeclarationFactory;
import kr.simula.formula.core.factory.FunctionDeclFactory;
import kr.simula.formula.core.ref.ArgDeclRef;
import kr.simula.formula.core.ref.VariableRef;
import kr.simula.formula.core.wrapper.LocalFunction;
import kr.simula.formula.script.ScriptTokens;
import kr.simula.formula.script.statement.FunctionDeclStatement;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class ScriptDeclarationHelper extends DeclarationHelper {

	static DeclarationFactory varDeclFactory = new DeclarationFactory() {

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public VariableRef<?> create(BuildContext context, Class<?> type,
				String name) {
			VariableRef<?> var = new VariableRef(type,new QName(name));
			context.registerRef(var.qualifiedName(), var);
			return var;
		}
		
	};

	static DeclarationFactory argDeclFactory = new DeclarationFactory() {

		@Override
		public ArgDeclRef create(BuildContext context, Class<?> type,
				String name) {
			ArgDeclRef arg = new ArgDeclRef(type,new QName(name));
			return arg;
		}
		
	};

	public static class DefaultFunctionDeclFactory implements FunctionDeclFactory {

		@Override
		public BlockStatement create(BuildContext current, Class<?> retType, String name,
				List<Ref> args) {
			FunctionDeclStatement stmt = new FunctionDeclStatement(retType, name, args);
			
			LocalFunction<?> localFunction = stmt.getLocalFunction();
			current.registerLocalFn(name, localFunction);
			
			return stmt;
		}

	}
	
	public ScriptDeclarationHelper() {
		super(new DefaultFunctionDeclFactory());
	}
	
	@Override
	protected void initDefaults() {
		super.initDefaults();

		setFactory(ScriptTokens.VAR_DECL, varDeclFactory);
		setFactory(ScriptTokens.ARG_DECL, argDeclFactory);
	}
	
	

}
