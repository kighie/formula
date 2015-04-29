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
package kr.simula.formula.core;

import kr.simula.formula.FormulaException;

/**
 * 
 * <pre>
 * </pre>
 * @author IkChan Kwon
 * @date 2012. 10. 22.
 * @since	1.0
 */
public class EvalException extends FormulaException {

	private static final long serialVersionUID = 1050340953390702771L;
	
	private Node node;

	public EvalException(String message) {
		super(message);
	}

	public EvalException(Node node) {
		super();
		setNode(node);
	}

	public EvalException(Node node, String message, Throwable cause) {
		super(message, cause);
		setNode(node);
	}

	public EvalException(Node node, String message) {
		super(message);
		setNode(node);
	}

	public EvalException(Node node, Throwable cause) {
		super(cause);
		setNode(node);
	}
	
	public void setNode(Node node) {
		this.node = node;
		setLocation(node.getLocation());
	}
	
	@Override
	public String toString() {
		if(sourceLocation != null){
			StringBuilder buf = new StringBuilder();
			buf.append(getMessage());

			if(node != null){
				buf.append( " <").append(node.getToken()).append("> ");
			}
			buf.append( " at ").append(sourceLocation);
			return buf.toString();
		} else {
			return super.toString();
		}	
	}
}
