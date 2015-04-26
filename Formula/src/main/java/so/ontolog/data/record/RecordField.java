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
package so.ontolog.data.record;

import so.ontolog.data.common.Field;
import so.ontolog.data.common.Undefined;

public class RecordField implements Field {
	private static final long serialVersionUID = 8161179718435161133L;

	public static final int UNDEFINED_LENGTH = -1;
	public static final Class<?> UNDEFINED_TYPE = Undefined.class;
	public static final Object UNDEFINED_VAL = Undefined.VALUE;
	
	private Class<?> type;
	private int length = UNDEFINED_LENGTH;
	private final String name;

	public RecordField(String name) {
		this.name = name;
	}

	public RecordField(String name , Class<?> type, int length) {
		this.type = type;
		this.length = length;
		this.name = name;
	}

	@Override
	public String name() {
		return name;
	}

	public Class<?> type() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}

	public int length() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * if value is null nor type is null, returns true.
	 * @param value
	 * @return
	 */
	public boolean checkType(Object value){
		if(value == null || type == null){
			return true;
		}
		
		return type.isAssignableFrom(value.getClass());
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		if(type != null){
			buf.append(type.getName()).append(" ");
			
			if(length > UNDEFINED_LENGTH){
				buf.append("(").append(length).append(") ");
			}
		}
		buf.append(name);
		
		return buf.toString();
	}
}
