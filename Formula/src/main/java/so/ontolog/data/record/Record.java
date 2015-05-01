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

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 * <pre></pre>
 * @author kighie@gmail.com
 *
 */
public class Record implements Map<String, Object>{

	protected final RecordMetadata metadata;
	protected Object[] values;
	

	public Record(RecordMetadata metadata) {
		this(metadata, new Object[metadata.size()]);
	}
	
	public Record(RecordMetadata metadata, Object[] values) {
		this.metadata = metadata;
		this.values = values;
	}

	public RecordMetadata getMetadata() {
		return metadata;
	}
	
	public String getName() {
		return metadata.getName();
	}

	@Override
	public void clear() {
		Arrays.fill(values, null);
	}

	@Override
	public boolean containsKey(Object key) {
		if(key instanceof String){
			return metadata.contains((String)key);
		}
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		if(value == null){
			return false;
		}
		return Arrays.binarySearch(values, value) >= 0;
	}

	@Override
	public Set<java.util.Map.Entry<String, Object>> entrySet() {
		return new EntrySet();
	}

	@Override
	public Object get(Object key) {
		if(key instanceof String){
			return values[ metadata.indexOf((String)key) ];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return metadata.isEmpty();
	}

	@Override
	public Set<String> keySet() {
		return metadata.keySet();
	}

	public void setValue(String key, Object value){
		int index = metadata.indexOf(key);
		set(index, key, value);
	}

	public void setValue(int index, Object value){
		String key = metadata.getKey(index);
		set(index, key, value);
	}
	
	@Override
	public Object put(String key, Object value) {
		int index = metadata.indexOf(key);
		return set(index, key, value);
	}

	protected Object set(int index, String key, Object value) {
		if(index < 0){
			throw new IllegalArgumentException(key + " is not found.");
		}
		
		RecordField f = metadata.get(index);
		
		if( f != null && !f.checkType(value) ){
			throw new IllegalArgumentException("Field '" + key + "' is " 
					+ f.type().getName() + ", but value is " + value.getClass().getName());
		}
		
		Object old = values[index];
		values[index] = value;
		return old;
	}

	@Override
	public void putAll(Map<? extends String, ? extends Object> m) {
		int index = 0;
		for( String key : metadata.keySet() ){
			set(index, key, m.get(key));
			index++;
		}
	}

	@Override
	public Object remove(Object key) {
		return put((String)key, null);
	}

	@Override
	public int size() {
		return metadata.size();
	}

	@Override
	public Collection<Object> values() {
		return Arrays.asList(values);
	}

	
	

    protected final class EntrySet extends AbstractSet<Map.Entry<String,Object>> {
    	
    	private Entry[] entries;
    	
    	public EntrySet() {
    		init();
		}
    	
    	private void init(){
    		entries = new Entry[metadata.size()];
    		for(int i=entries.length-1 ; i>=0 ; i--){
    			entries[i] = new Entry(i);
    		}
    	}
    	
        public Iterator<Map.Entry<String,Object>> iterator() {
        	Iterator<Map.Entry<String,Object>> iterator = new Iterator<Map.Entry<String,Object>>() {
        		int cursor = -1;
        		public void remove() {
    				if((cursor > -1) && (cursor < entries.length)){
    					Record.this.remove(entries[cursor].getKey());
    				}
    			}
    			
    			public Map.Entry<String,Object> next() {
    				cursor++;
    				return entries[cursor];
    			}
    			
    			public boolean hasNext() {
    				return (cursor + 1) < entries.length ;
    			}
    		};
    		
    		return iterator;
        }
        
        protected Entry getEntryAny(String key){
        	int index = metadata.indexOf(key);
        	if((index > -1) && (index < entries.length)){
				return entries[index];
			}
        	
        	return null;
        }
        
        public boolean contains(Object o) {
            if (!(o instanceof Entry)){
            	 return false;
            }
            
            Entry e = (Entry) o;
            Entry candidate = getEntryAny(e.getKey());
            
            return (candidate != null) && candidate.equals(e);
        }
        
        public boolean remove(Object key) {
        	Record.this.remove(key);
            return true;
        }
        
        public int size() {
            return metadata.size();
        }
        
        public void clear() {
            Record.this.clear();
        }
    }
    
    protected final class Entry implements Map.Entry<String,Object> {
    	private int index;
    	
		public Entry(int index) {
			this.index = index;
		}

		public String getKey() {
			return metadata.getKey(index);
		}

		public Object getValue() {
			return values[index];
		}

		public Object setValue(Object value) {
			return put(getKey(), value);
		}
    	
		@Override
		public boolean equals(Object obj) {
			if(obj == null){
				return false;
			}
			
			if( obj instanceof Entry){
				Entry other = (Entry)obj;
				if(other.getKey().equals(getKey())){
					Object val = getValue();
					Object val2 = other.getValue();
					
					return (val == val2) || ( (val != null) && val.equals(val2));
				}
			}
			
			return false;
		}
    }

}
