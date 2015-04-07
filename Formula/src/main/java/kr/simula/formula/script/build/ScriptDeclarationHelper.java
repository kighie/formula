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

import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.factory.DeclarationFactory;
import kr.simula.formula.core.factory.helper.DeclarationHelper;
import kr.simula.formula.script.ScriptTokens;
import kr.simula.formula.script.statement.VariableDeclaration;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class ScriptDeclarationHelper extends DeclarationHelper {

	static DeclarationFactory varDeclFactory = new DeclarationFactory() {

		@Override
		public VariableDeclaration create(BuildContext context, String token, String type,
				String name) {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	
	
	@Override
	protected void initDefaults() {
		super.initDefaults();
		
		setFactory(ScriptTokens.VAR_DECL, varDeclFactory);
	}
	
}
