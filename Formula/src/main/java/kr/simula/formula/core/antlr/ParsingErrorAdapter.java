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

import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;

import kr.simula.formula.core.builder.BuildErrorListener;
import kr.simula.formula.core.builder.BuildException;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class ParsingErrorAdapter implements ANTLRErrorListener {

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
//		System.out.println("ERR[syntaxError] : " + e);
//		System.out.println("\t " + msg);
		for(BuildErrorListener l : listeners){
			l.syntaxError(line, charPositionInLine, msg);
		}
		
		throw new BuildException(msg);
	}

	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex,
			int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
//		System.out.println("ERR[reportAmbiguity] : " + dfa);
	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa,
			int startIndex, int stopIndex, BitSet conflictingAlts,
			ATNConfigSet configs) {
//		System.out.println("ERR[reportAttemptingFullContext] : " + dfa);

	}

	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa,
			int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
//		System.out.println("ERR[reportContextSensitivity] : " + dfa);
	}

}
