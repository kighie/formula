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

import java.util.List;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.util.GettableUtils;
import kr.simula.formula.core.util.TypeUtils;
import kr.simula.formula.core.wrapper.ArrayGettable;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ArrayHelper {

	/**<pre>
	 * </pre>
	 * @param current
	 * @param elements
	 * @return
	 */
	public Gettable<?> create(BuildContext current, List<Node> elements) {
		Class<?> etype = null;
		
		if(elements == null || elements.size() ==0){
			throw new BuildException("Empty Array.");
		}
		
		Gettable<?>[]array = new Gettable<?>[elements.size()];
		
		int index=0;

		for(Node n : elements){
			Gettable<?> g = GettableUtils.checkGettable(n);
			array[index++] = g;
			Class<?> gtype = g.type();
			
			if(Object.class != etype){
				if(etype != null){
					if( gtype == null) {
						gtype = Object.class;
					} else if(!etype.isAssignableFrom(gtype)) {
						gtype = Object.class;
					}
				} else {
					etype = gtype;
				}
			}
			
		}
		
		String atypeStr = "[L" + etype.getName() + ";";
		Class<?> type = TypeUtils.forName(atypeStr);
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayGettable arrayGettable = new ArrayGettable(type, etype, array);
		return arrayGettable;
	}

}
