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
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.QName;


/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class StaticFieldGettable<T> extends GenericRef implements Gettable<T>{

	private T staticField;
	
	/**
	 * @param qname
	 */
	public StaticFieldGettable(QName qname, T staticField) {
		super(qname);
		this.staticField = staticField;
	}

	/* (non-Javadoc)
	 * @see kr.simula.formula.core.Ref#type()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Class<T> type() {
		return (Class<T>)staticField.getClass();
	}

	@Override
	public T get(Context context) {
		return staticField;
	}

}
