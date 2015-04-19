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
package kr.simula.formula.core.wrapper;

import java.lang.reflect.Array;
import java.util.Arrays;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ArrayGettable<T, E> implements Gettable<T>{
	private final Class<T> type;
	private final Class<E> elementType;
	private final Gettable<?>[] array;
	
	/**
	 * @param type
	 * @param array
	 */
	public ArrayGettable(Class<T> type,Class<E> elementType, Gettable<?>[] array) {
		this.type = type;
		this.elementType = elementType;
		this.array = array;
	}

	@Override
	public ValueType valueType() {
		return ValueType.ARRAY;
	}

	@Override
	public Class<T> type() {
		return type;
	}

	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("[");
		for(Gettable<?> g : array){
			buf.append(g.getExpression()).append(" ");
		}
		buf.append("]");
		
		return buf.toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Context context) {
		int length = array.length;
		E[] valArray = (E[])Array.newInstance(elementType, length);
		
		for(int i = 0 ; i<length ; i++){
			valArray[i] = (E)array[i].get(context);
		}

		return (T)valArray;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
