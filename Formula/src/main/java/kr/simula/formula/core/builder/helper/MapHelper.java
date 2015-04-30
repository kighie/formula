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
package kr.simula.formula.core.builder.helper;

import java.util.Map;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.factory.MapGettableFactory;
import kr.simula.formula.core.wrapper.MapGettable;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class MapHelper extends AbstractHelper<MapGettableFactory>{

	/**<pre>
	 * </pre>
	 * @param current
	 * @param token
	 * @param entrySet
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Gettable<Map> create(BuildContext current, String token) {
		MapGettableFactory factory = factories.get(token);
		if(factory == null){
			throw new BuildException("MapGettableFactory for " + token + " is not registered.");
		}
		return factory.create(current, token);
	}

	/**<pre>
	 * </pre>
	 * @param current
	 * @param mapGettable
	 * @param entryType
	 * @param name
	 * @param value
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void mapEntry(BuildContext current, Gettable<?> mapGettable,
			Class<?> entryType, String name, Gettable<?> value) {
		if(mapGettable instanceof MapGettable){
			((MapGettable)mapGettable).addEntry(entryType, name, value);
		}
	}

}
