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
package kr.simula.formula.script.statement;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.ref.VariableRef;
import kr.simula.formula.util.Range;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class LoopConditionStatement extends AbstractStatement {
	@SuppressWarnings("rawtypes")
	private VariableRef varRef;
	private Ref iteratorRef;
	private Range range;
	
	
	/**
	 * @param varRef
	 */
	@SuppressWarnings("rawtypes")
	public LoopConditionStatement(VariableRef varRef) {
		this.varRef = varRef;
	}

	public Ref getIteratorRef() {
		return iteratorRef;
	}

	public void setIteratorRef(Ref iteratorRef) {
		this.iteratorRef = iteratorRef;
	}
	
	/**
	 * @return the varRef
	 */
	public VariableRef<?> getVarRef() {
		return varRef;
	}
	
	/**
	 * @return the range
	 */
	public Range getRange() {
		return range;
	}
	
	public void setRange(Range range) {
		this.range = range;
	}
	
	@Override
	public void eval(Context context) {
		//
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("(").append(varRef.getExpression());
		if(iteratorRef != null) {
			buf.append(iteratorRef.getExpression());
		} else if(range != null) {
			buf.append(range.toString());
		} 
		
		return buf.toString();
	}

}
