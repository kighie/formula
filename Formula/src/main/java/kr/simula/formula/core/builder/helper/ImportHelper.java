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
package kr.simula.formula.core.builder.helper;

import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.ref.TypeRef;
import kr.simula.formula.core.util.RefUtils;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class ImportHelper {

	/**<pre>
	 * </pre>
	 * @param current
	 * @param ref
	 */
	public void importJava(BuildContext current, Ref ref) {
		QName qname = ref.qualifiedName();
		
		Class<?> type = RefUtils.toClass(qname.getFullName());
		System.out.println(ref);
		TypeRef typeRef = new TypeRef(new QName(qname.getName()), type);
		current.registerRef(typeRef.qualifiedName(), typeRef);
	}

}
