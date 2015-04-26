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
import java.util.Map;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.GrammarTokens;


/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
@SuppressWarnings("rawtypes")
public class SimpleMapGettable  extends MapGettable<Map>{

//	@Override
//	public ValueType valueType() {
//		return ValueType.MAP;
//	}

	@Override
	public Class<? extends Map> type() {
		return Map.class;
	}
	
	@Override
	public String getToken() {
		return GrammarTokens.SIMPLE_MAP;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Map get(Context context) {
		Map map = new HashMap();
		for( KeyValue kv : entries.values()){
			map.put(kv.key, kv.value.get(context));
		}
		return map;
	}
	
}
