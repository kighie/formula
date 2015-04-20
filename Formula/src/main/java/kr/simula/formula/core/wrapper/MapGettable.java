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
package kr.simula.formula.core.wrapper;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.builder.BuildException;


/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
@SuppressWarnings("rawtypes")
public abstract class MapGettable<T extends Map>  implements Gettable<T>{
	protected Map<String, KeyValue<?>> entries = new LinkedHashMap<String, MapGettable.KeyValue<?>>();
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("{");
		boolean first = true;
		for( KeyValue kv : entries.values()){
			if(!first){
				buf.append(",");
			} else {
				first = false;
			}
			buf.append(kv.key).append(" : ").append(kv.value);
		}
		buf.append("}");
		
		return buf.toString();
	}
	
	@SuppressWarnings("unchecked")
	public void addEntry(Class<?> type, String key, Gettable<?> value){
		if(entries.containsKey(key)){
			throw new BuildException(key + " is already registered.");
		}
		KeyValue<?> keyValue = new KeyValue(type, key, value);
		entries.put(key, keyValue);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(Context context) {
		Map map = new HashMap();
		for( KeyValue kv : entries.values()){
			map.put(kv.key, kv.value);
		}
		return (T)map;
	}
	
	protected static class KeyValue<E> {
		protected final Class<E> type;
		protected final String key;
		protected final Gettable<E> value;
		
		/**
		 * @param type
		 * @param key
		 * @param value
		 */
		public KeyValue(Class<E> type, String key, Gettable<E> value) {
			super();
			this.type = type;
			this.key = key;
			this.value = value;
		}
		
	}
}
