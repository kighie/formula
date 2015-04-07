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
package kr.simula.formula.script.statement;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class VariableDeclaration extends AbstractStatement implements Ref {
	private Class<?> type;
	private QName qname;
	private Gettable<?> valueNode;
	
	/**
	 * @param type
	 * @param qname
	 * @param valueNode
	 */
	public VariableDeclaration(Class<?> type, QName qname,
			Gettable<?> valueNode) {
		super();
		this.type = type;
		this.qname = qname;
		this.valueNode = valueNode;
	}

	/**
	 * @return the type
	 */
	public Class<?> getType() {
		return type;
	}
	
	/**
	 * @return the qname
	 */
	public QName getQname() {
		return qname;
	}
	
	/**
	 * @return the valueNode
	 */
	public Gettable<?> getValueNode() {
		return valueNode;
	}
	
	@Override
	public void eval(Context context) {
		if(valueNode != null){
			Object value = valueNode.get(context);
			context.setReference(qname, value);
		}
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("VAR-DECL ").append(type.getName()).append(" ").append(qname);
		if(valueNode != null){
			buf.append(" ").append(valueNode.getExpression());
		}
		return buf.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("VAR-DECL ").append(type.getName()).append(" ").append(qname);
		if(valueNode != null){
			buf.append(" ").append(valueNode.toString());
		}
		return buf.toString();
	}
}
