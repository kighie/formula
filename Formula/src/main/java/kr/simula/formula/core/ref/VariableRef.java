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
package kr.simula.formula.core.ref;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.InternalException;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Settable;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class VariableRef<T> extends GenericRef implements GettableRef<T>, Settable<T>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4458545471076570289L;
	protected Class<? extends T> valueType;
	
	/**
	 * @param qname
	 */
	public VariableRef(Class<? extends T> valueType, QName qname) {
		super(qname);
		this.valueType = valueType;
	}
	
	@Override
	public Class<? extends T> type() {
		return valueType;
	}
	
	@Override
	public void set(Context context, T value) {
		if( valueType != null && value != null){
			if(!valueType.isAssignableFrom(value.getClass())){
				throw new InternalException("Value " + value + " cannot be set to " + qname);
			}
		}
		context.setReference(qname, value);
	}

	public void setLocal(Context context, T value) {
		context.setLocalVar(qname, value);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(Context context) {
		return (T)context.getReference(qname);
	}
	
	@Override
	public String getExpression() {
		return qname.toString();
	}
	
	@Override
	public String toString() {
		return "{var:" + ((valueType != null) ? valueType.getSimpleName() : "Undefined") + " " + qname + "}";
	}
	
}
