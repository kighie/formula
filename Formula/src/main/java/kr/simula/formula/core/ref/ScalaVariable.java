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

import java.math.BigDecimal;
import java.util.Date;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Settable;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public abstract class ScalaVariable<T> extends GenericRef implements Gettable<T>, Settable<T>{
	protected Class<? extends T> valueType;
	
	/**
	 * @param qname
	 */
	public ScalaVariable(Class<? extends T> valueType, QName qname) {
		super(qname);
		this.valueType = valueType;
	}
	
	@Override
	public Class<? extends T> type() {
		return valueType;
	}
	
	@Override
	public void set(Context context, T value) {
		context.setReference(qname, value);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(Context context) {
		return (T)context.getReference(qname);
	}
	
	public static class StringVariable extends ScalaVariable<String>{
		/**
		 * @param qname
		 * @param value
		 */
		public StringVariable(QName qname) {
			super(String.class, qname);
		}
		
		@Override
		public ValueType valueType() {
			return ValueType.TEXT;
		}
	}
	

	public static class NumberVariable extends ScalaVariable<BigDecimal>{
		/**
		 * @param qname
		 * @param value
		 */
		public NumberVariable(QName qname) {
			super(BigDecimal.class, qname);
		}
		
		@Override
		public ValueType valueType() {
			return ValueType.NUMERIC;
		}
	}

	public static class BooleanVariable extends ScalaVariable<Boolean>{
		/**
		 * @param qname
		 * @param value
		 */
		public BooleanVariable(QName qname) {
			super(Boolean.class, qname);
		}
		
		@Override
		public ValueType valueType() {
			return ValueType.LOGICAL;
		}
	}
	
	public static class DateVariable extends ScalaVariable<Date>{
		/**
		 * @param qname
		 * @param value
		 */
		public DateVariable(QName qname) {
			super(Date.class, qname);
		}
		
		@Override
		public ValueType valueType() {
			return ValueType.DATE;
		}
	}

	public static class ObjectVariable extends ScalaVariable<Object>{
		/**
		 * @param qname
		 * @param value
		 */
		public ObjectVariable(QName qname) {
			super(Object.class, qname);
		}
		
		@Override
		public ValueType valueType() {
			return ValueType.OBJECT;
		}
	}
}
