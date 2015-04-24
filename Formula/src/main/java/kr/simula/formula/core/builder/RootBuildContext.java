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
package kr.simula.formula.core.builder;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import kr.simula.formula.core.Function;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.helper.GlobalFunctionRegistry;

/**
 * 
 * @author IkChan Kwon
 * @date 2012. 10. 10.
 * @since	1.0
 */
public class RootBuildContext implements BuildContext {
	private Map<QName, Ref> referenceMap = new HashMap<QName, Ref>();
	private Map<String, Function<?>> functionMap = new HashMap<String, Function<?>>();
	private GlobalFunctionRegistry globalFunctionRegistry;

	@Override
	public BuildContext getParent() {
		return null;
	}
	
	@Override
	public void registerRef(QName qname, Ref ref) {
		referenceMap.put(qname, ref);
	}
	@Override
	public Ref getRef(QName qname) {
		return referenceMap.get(qname);
	}
	@Override
	public Iterable<Entry<QName, Ref>> references() {
		return referenceMap.entrySet();
	}

	/**
	 * @param key
	 * @return
	 * @see java.util.Map#get(java.lang.Object)
	 */
	public Function<?> getLocalFn(String fnName) {
		return functionMap.get(fnName);
	}
	
	/**
	 * @param key
	 * @param value
	 * @return
	 * @see java.util.Map#put(java.lang.Object, java.lang.Object)
	 */
	public void registerLocalFn(String key, Function<?> value) {
		functionMap.put(key, value);
	}
	
	@Override
	public Function<?> getGlobalFunction(String fnName) {
		return globalFunctionRegistry.getFunction(fnName);
	}
	
	/**<pre>
	 * </pre>
	 * @param globalFunctionRegistry
	 */
	public void setFunctionRegistry(
			GlobalFunctionRegistry globalFunctionRegistry) {
		this.globalFunctionRegistry = globalFunctionRegistry;
	}
	
	
}
