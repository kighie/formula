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
import kr.simula.formula.core.Node;
import kr.simula.formula.core.ref.VariableRef;
import kr.simula.formula.core.util.GettableUtils;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class VariableDeclStatement extends AbstractStatement {
	@SuppressWarnings("rawtypes")
	private VariableRef varRef;
	private Gettable<?> valueNode;
	
	/**
	 * @param varRef
	 * @param valueNode
	 */
	public VariableDeclStatement(VariableRef<?> varRef, Gettable<?> valueNode) {
		this.varRef = varRef;
		this.valueNode = valueNode;
	}
	
	@Override
	public ValueType valueType() {
		return varRef.valueType();
	}

	public Class<?> type(){
		return varRef.type();
	}
	
	/**
	 * @param valueNode the valueNode to set
	 */
	public void setValueNode(Gettable<?> valueNode) {
		this.valueNode = valueNode;
	}

	public void setValueNode(Node node) {
		this.valueNode = GettableUtils.checkGettable(node);
	}
	
	/**
	 * @return the valueNode
	 */
	public Gettable<?> getValueNode() {
		return valueNode;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void eval(Context context) {
		if(valueNode != null){
			Object value = valueNode.get(context);
			varRef.set(context, value);
		}
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("VAR-DECL ").append(varRef.type().getSimpleName()).append(" ").append(varRef.getExpression());
		if(valueNode != null){
			buf.append(" := ").append(valueNode.getExpression());
		}
		return buf.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("VAR-DECL ").append(varRef.toString());
		if(valueNode != null){
			buf.append(" ").append(valueNode.toString());
		}
		return buf.toString();
	}

}
