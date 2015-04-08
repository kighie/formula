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
package kr.simula.formula.core;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class BlockContext implements Context {
	private Context parent;
	private Map<QName, Object> refMap = new HashMap<QName, Object>();
	
	
	/**
	 * @param parent
	 */
	public BlockContext(Context parent) {
		this.parent = parent;
	}

	@Override
	public Object getAttribute(String name) {
		return parent.getAttribute(name);
	}
	
	@Override
	public Object getReference(QName name) {
		Object value = refMap.get(name);
		if(value == null){
			value = parent.getReference(name);
		}
		return value;
	}
	
	@Override
	public void setReference(QName name, Object value) {
		Object ref = refMap.get(name);
		if(ref == null){
			ref = parent.getReference(name);
			if(ref != null){
				parent.setReference(name, value);
				return;
			}
		}
		refMap.put(name, value);
	}

	@Override
	public void setLocalVar(QName name, Object value) {
		refMap.put(name, value);
	}

	@Override
	public void clear() {
		refMap.clear();
	}

}
