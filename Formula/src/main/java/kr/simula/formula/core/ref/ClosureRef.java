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
package kr.simula.formula.core.ref;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Function;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.wrapper.AbstractNode;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
@SuppressWarnings("rawtypes")
public class ClosureRef extends AbstractNode implements GettableRef<Function> {

	protected final QName qname;
	
	
	/**
	 * @param qname
	 */
	public ClosureRef(QName qname) {
		super();
		this.qname = qname;
	}

//	@Override
//	public ValueType valueType() {
//		return ValueType.FUNCTION;
//	}

	public String getToken() {
		return GrammarTokens.REF;
	};
	
	@Override
	public Class<Function> type() {
		return Function.class;
	}
	
	@Override
	public Function<?> get(Context context) {
		Function function = (Function)context.getReference(qname);
		return function;
	}
	
	@Override
	public String getExpression() {
		return "{closure:" + qname.getName() + "}";
	}

	@Override
	public QName qualifiedName() {
		return qname;
	}
	
	@Override
	public String toString() {
		return "{closure:" + qname.getName() + "}";
	}

}
