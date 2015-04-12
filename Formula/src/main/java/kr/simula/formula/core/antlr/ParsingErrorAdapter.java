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
package kr.simula.formula.core.antlr;

import java.util.LinkedList;
import java.util.List;

import kr.simula.formula.core.builder.BuildErrorListener;
import kr.simula.formula.core.builder.BuildException;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class ParsingErrorAdapter extends BaseErrorListener {

	private List<BuildErrorListener> listeners = new LinkedList<BuildErrorListener>();
	
	
	public boolean addListener(BuildErrorListener e) {
		return listeners.add(e);
	}

	public boolean removeListener(BuildErrorListener o) {
		return listeners.remove(o);
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		if(listeners.size()>0){
			for(BuildErrorListener l : listeners){
				l.syntaxError(line, charPositionInLine, msg);
			}
		} else {
			throw new BuildException(msg, e).setLocation(line, charPositionInLine);
		}
	}
}
