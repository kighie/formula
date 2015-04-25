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

import kr.simula.formula.FormulaException;
import kr.simula.formula.core.SourceLocation;


/**
 * 
 * <pre>
 * </pre>
 * @author IkChan Kwon
 * @date 2012. 10. 22.
 * @since	1.0
 */
public class BuildException extends FormulaException {

	private static final long serialVersionUID = 1050340953390702771L;
	
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
}
