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
import kr.simula.formula.core.Function;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.builder.helper.DeclarationHelper;
import kr.simula.formula.core.factory.DeclarationFactory;
import kr.simula.formula.core.factory.FunctionDeclFactory;
import kr.simula.formula.core.ref.ArgDeclRef;
import kr.simula.formula.core.ref.DeclaredParameterRef;
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
		public Ref create(BuildContext context, Class<?> type,
				String name) {
			QName qname = new QName(name);
			
			if(context.getRef(qname) != null){
				throw new BuildException("Variable '" + name + "' is already registered.");
			}
			Ref ref = new VariableRef(type,qname);
			context.registerRef(qname, ref);
			
//			QName qname;
//			Ref ref;
//			if(Function.class.isAssignableFrom(type)){
//				qname = QName.getClosureQName(name);
//				ref = new ClosureRef(qname);
//			} else {
//				qname = new QName(name);
//				ref = new VariableRef(type,qname);
//			}
			return ref;
		}
		
	};

	static DeclarationFactory argDeclFactory = new DeclarationFactory() {

		@Override
		public ArgDeclRef create(BuildContext context, Class<?> type,
				String name) {
			QName qname;
			if(Function.class.isAssignableFrom(type)){
				qname = QName.getClosureQName(name);
			} else {
				qname = new QName(name);
			}
			ArgDeclRef arg = new ArgDeclRef(type,qname);
			return arg;
		}
		
	};

	static DeclarationFactory paramDeclFactory = new DeclarationFactory() {

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Ref create(BuildContext context, Class<?> type,
				String name) {
			QName qname = new QName(name);
			
			if(context.getRef(qname) != null){
				throw new BuildException("Parameter '" + name + "' is already registered.");
			}
			Ref ref = new DeclaredParameterRef(type,qname);
			context.registerRef(qname, ref);
			return ref;
		}
		
	};

	public static class DefaultFunctionDeclFactory implements FunctionDeclFactory {

		@Override
		public BlockStatement create(BuildContext current, Class<?> retType, String name,
				List<Ref> args) {
			FunctionDeclStatement stmt = new FunctionDeclStatement(retType, name, args);
			
			LocalFunction<?> localFunction = stmt.getLocalFunction();
			current.getParent().registerLocalFn(name, localFunction);
			
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
		setFactory(ScriptTokens.PARAM_DECL, paramDeclFactory);
		
	}
	
	

}
