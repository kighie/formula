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
package kr.simula.formula;

import kr.simula.formula.core.Node;
import kr.simula.formula.core.SourceLocation;
import kr.simula.formula.core.util.SourceLocationUtils;

/**
 * 
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class FormulaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	protected SourceLocation sourceLocation;
	
	/**
	 * 
	 */
	public FormulaException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public FormulaException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public FormulaException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public FormulaException(Throwable cause) {
		super(cause);
	}

	public FormulaException setLocation(Node node) {
		this.sourceLocation = node.getLocation();
		return this;
	}

	public FormulaException setLocation(SourceLocation token) {
		this.sourceLocation = token;
		return this;
	}

	public FormulaException setLocation(int line, int charPositionInLine) {
		this.sourceLocation = SourceLocationUtils.createSourceLocation(line, charPositionInLine);
		return this;
	}

	public FormulaException setLocation(int line, int charPositionInLine, 
			int startIndex, int endIndex) {
		this.sourceLocation = SourceLocationUtils.createSourceLocation(line, charPositionInLine, startIndex, endIndex);
		return this;
	}

	public SourceLocation getLocation() {
		return sourceLocation;
	}
	
	@Override
	public String toString() {
		if(sourceLocation != null){
			StringBuilder buf = new StringBuilder();
			buf.append(super.toString());
			buf.append( " at ").append(sourceLocation);
			return buf.toString();
		} else {
			return super.toString();
		}	
	}
}
