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
package kr.simula.formula.core.ref;

import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.wrapper.AbstractNode;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class TypeRef extends AbstractNode implements Ref{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6207531360524759966L;
	private Class<?> type;
	private QName qname;
	
	/**
	 * @param type
	 * @param qname
	 */
	public TypeRef(QName qname, Class<?> type) {
		this.type = type;
		this.qname = qname;
	}

	@Override
	public String getExpression() {
		return "type " + type;
	}
	
	@Override
	public String getToken() {
		return "type";
	}
	
	@Override
	public QName qualifiedName() {
		return qname;
	}


	@Override
	public Class<?> type() {
		return type;
	}

}
