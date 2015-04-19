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
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Settable;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class AssignStatement<T> extends AbstractStatement {

	private Settable<T> settable;
	private Gettable<? extends T> gettable;
	
	/**
	 * @param settable
	 * @param gettable
	 */
	public AssignStatement(Settable<T> settable, Gettable<? extends T> gettable) {
		super();
		this.settable = settable;
		this.gettable = gettable;
	}

	@Override
	public void eval(Context context) {
		T value = gettable.get(context);
		settable.set(context, value);
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("ASSIGN ").append(settable.getExpression()).append(" <- ");
		buf.append(gettable.getExpression());
		return buf.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("ASSIGN ").append(settable.toString()).append(" <- ");
		buf.append(gettable.toString());
		return buf.toString();
	}
}
