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
package kr.simula.formula.core.ref;

import kr.simula.formula.core.QName;
import kr.simula.formula.core.util.ValueTypeUtils;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ArgDeclRef  extends GenericRef {
	protected Class<?> type;
	
	/**
	 * @param qname
	 */
	public ArgDeclRef(Class<?> type, QName qname) {
		super(qname);
		this.type = type;
	}
	
	/**
	 * @return the type
	 */
	public Class<?> type() {
		return type;
	}
	
	@Override
	public ValueType valueType() {
		return ValueTypeUtils.getValueType(type);
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append(type.getName()).append(" ").append(qname);
		return buf.toString();
	}
}
