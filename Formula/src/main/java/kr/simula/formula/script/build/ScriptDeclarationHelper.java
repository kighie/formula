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

import kr.simula.formula.core.QName;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.factory.DeclarationFactory;
import kr.simula.formula.core.factory.helper.DeclarationHelper;
import kr.simula.formula.core.ref.VariableRef;
import kr.simula.formula.script.ScriptTokens;

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
	
	
	@Override
	protected void initDefaults() {
		super.initDefaults();
		
		setFactory(ScriptTokens.VAR, varDeclFactory);
	}
	
}
