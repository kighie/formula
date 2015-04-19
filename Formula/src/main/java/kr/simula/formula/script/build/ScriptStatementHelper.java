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
package kr.simula.formula.script.build;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.builder.helper.StatementHelper;
import kr.simula.formula.core.factory.StatementFactory;
import kr.simula.formula.core.ref.MethodRef;
import kr.simula.formula.core.ref.VariableRef;
import kr.simula.formula.core.util.GettableUtils;
import kr.simula.formula.core.wrapper.SettableRefWrapper;
import kr.simula.formula.script.ScriptTokens;
import kr.simula.formula.script.statement.AssignStatement;
import kr.simula.formula.script.statement.ForeachStatement;
import kr.simula.formula.script.statement.FunctionCallStatement;
import kr.simula.formula.script.statement.FunctionDeclStatement;
import kr.simula.formula.script.statement.IfStatement;
import kr.simula.formula.script.statement.LoopConditionStatement;
import kr.simula.formula.script.statement.MethodCallStatement;
import kr.simula.formula.script.statement.ReturnStatement;
import kr.simula.formula.script.statement.VariableDeclStatement;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ScriptStatementHelper extends StatementHelper {

	static StatementFactory ifFactory = new StatementFactory() {
		@Override
		public IfStatement create(BuildContext context, String token, Node[] args) {
			Gettable<Boolean> condition = GettableUtils.getBooleanGettable(args[0]);
			IfStatement stmt = new IfStatement(condition);
			return stmt;
		}
	};

	static StatementFactory methodCallFactory = new StatementFactory() {
		@Override
		public MethodCallStatement create(BuildContext context, String token, Node[] args) {
			MethodRef<?> methodRef = (MethodRef<?>)args[0];
			MethodCallStatement stmt = new MethodCallStatement(methodRef);
			return stmt;
		}
	};

	static StatementFactory functionCallFactory = new StatementFactory() {
		@Override
		public FunctionCallStatement create(BuildContext context, String token, Node[] args) {
			Gettable<?> gettable = (Gettable<?>)args[0];
			FunctionCallStatement stmt = new FunctionCallStatement(gettable);
			return stmt;
		}
	};

	static StatementFactory varDeclFactory = new StatementFactory() {
		@Override
		public VariableDeclStatement create(BuildContext context, String token, Node[] args) {
			VariableRef<?> varRef = (VariableRef<?>)args[0];
			
			Gettable<?> valueNode = null;
			if(args.length>1){
				valueNode = (Gettable<?>)args[1];
			}
			
			VariableDeclStatement stmt = new VariableDeclStatement(varRef, valueNode);
			return stmt;
		}
	};

	static StatementFactory loopCondFactory = new StatementFactory() {
		@Override
		public LoopConditionStatement create(BuildContext context, String token, Node[] args) {
			VariableRef<?> varRef = (VariableRef<?>)args[0];
			
			LoopConditionStatement stmt = new LoopConditionStatement(varRef);
			return stmt;
		}
	};

	static StatementFactory foreachFactory = new StatementFactory() {
		@Override
		public ForeachStatement create(BuildContext context, String token, Node[] args) {
			LoopConditionStatement loopCond = (LoopConditionStatement)args[0];
			ForeachStatement stmt = new ForeachStatement(loopCond);
			return stmt;
		}
	};

	static StatementFactory assignFactory = new StatementFactory() {
		@SuppressWarnings("rawtypes")
		@Override
		public AssignStatement create(BuildContext context, String token, Node[] args) {
			Ref ref = (Ref)args[0];
			Gettable<?> gettable = (Gettable<?>)args[1];
			AssignStatement stmt = new AssignStatement(new SettableRefWrapper(ref), gettable);
			return stmt;
		}
	};

	static StatementFactory returnFactory = new StatementFactory() {
		@Override
		public ReturnStatement create(BuildContext context, String token, Node[] args) {
			Gettable<?> gettable = null;
			FunctionDeclStatement functionDeclStatement = null;
			
			if(args != null && args.length > 1){
				functionDeclStatement = (FunctionDeclStatement)args[0];
				gettable = GettableUtils.checkGettable(args[1]);
			} else {
				throw new BuildException("return statement needs functionDeclStatement and gettable.");
			}

			QName returnValueKey = functionDeclStatement.getReturnValueKey();
			ReturnStatement stmt = new ReturnStatement(returnValueKey, gettable);

			return stmt;
		}
	};

	
	//VariableDeclStatement
	@Override
	protected void initDefaults() {
		super.initDefaults();
		setFactory(ScriptTokens.IF, ifFactory);
		setFactory(ScriptTokens.MTHODE_CALL_STMT, methodCallFactory);
		setFactory(ScriptTokens.FUNCTION_CALL_STMT, functionCallFactory);
		
		setFactory(ScriptTokens.VAR_DECL, varDeclFactory);
		setFactory(ScriptTokens.LOOP_COND_DECL, loopCondFactory);
		setFactory(ScriptTokens.FOREACH, foreachFactory);
		setFactory(ScriptTokens.RETURN, returnFactory);
		setFactory(ScriptTokens.ASSIGN_STMT, assignFactory);
		
		
	}
	
	
}
