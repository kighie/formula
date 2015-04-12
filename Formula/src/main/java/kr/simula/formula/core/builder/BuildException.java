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
package kr.simula.formula.core.builder;

import kr.simula.formula.core.SourceLocation;
import kr.simula.formula.core.util.SourceLocationUtils;

import org.antlr.v4.runtime.Token;


/**
 * 
 * <pre>
 * </pre>
 * @author IkChan Kwon
 * @date 2012. 10. 22.
 * @since	1.0
 */
public class BuildException extends RuntimeException {

	private static final long serialVersionUID = 1050340953390702771L;
	
	private SourceLocation sourceLocation;
	
	/**
	 * 
	 */
	public BuildException() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public BuildException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param arg0
	 */
	public BuildException(String message) {
		super(message);
	}


	/**
	 * @param arg0
	 */
	public BuildException(Throwable cause) {
		super(cause);
	}


	public BuildException setLocation(SourceLocation token) {
		this.sourceLocation = token;
		return this;
	}

	public BuildException setLocation(int line, int charPositionInLine) {
		this.sourceLocation = SourceLocationUtils.createSourceLocation(line, charPositionInLine);
		return this;
	}

	public BuildException setLocation(int line, int charPositionInLine, 
			int startIndex, int endIndex) {
		this.sourceLocation = SourceLocationUtils.createSourceLocation(line, charPositionInLine, startIndex, endIndex);
		return this;
	}

	public BuildException setLocation(Token token) {
		this.sourceLocation = SourceLocationUtils.createSourceLocation(token);
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
			buf.append("\n");
			buf.append( " at [").append(sourceLocation.getLine()).append(",").append(sourceLocation.getCharPositionInLine()).append("] ");
			
//			if(token instanceof CommonToken){
//				int index = ((CommonToken)token).getStartIndex();
//				buf.append("\n").append( token.getInputStream().getText(new Interval(0, index)) );
//			} else {
//				CharStream stream = token.getInputStream();
//				buf.append("\n").append( stream.getText(new Interval(0, stream.index())) );
//			}
			String source = sourceLocation.getSource();
			if(source != null){
				buf.append(source);
			}
			return buf.toString();
		} else {
			return super.toString();
		}	
	}
}
