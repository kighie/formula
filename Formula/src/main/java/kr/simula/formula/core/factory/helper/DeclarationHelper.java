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
package kr.simula.formula.core.factory.helper;

import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.factory.DeclarationFactory;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public abstract class DeclarationHelper extends AbstractHelper<DeclarationFactory> {

	/**<pre>
	 * </pre>
	 * @param context 
	 * @param token
	 * @param type
	 * @param name
	 * @return
	 */
	public Ref create(BuildContext context, String token, String type, String name) {
		DeclarationFactory factory = factories.get(token);
		if(factory == null){
			throw new BuildException("DeclarationFactory for " + token + " is not registered.");
		}
		return factory.create(context, token, type, name);
	}

	
}
