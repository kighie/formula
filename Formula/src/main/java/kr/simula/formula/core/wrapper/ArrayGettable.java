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
import java.util.Iterator;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.EvalException;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ArrayGettable<T, E> extends AbstractNode implements Gettable<T>{
	private final Class<T> type;
	private final Class<E> elementType;
	private final Gettable<?>[] array;
	
	/**
	 * @param type
	 * @param array
	 */
	public ArrayGettable(Class<T> type, Class<E> elementType, Gettable<?>[] array) {
		this.type = type;
		this.elementType = elementType;
		this.array = array;
	}

//	@Override
//	public ValueType valueType() {
//		return ValueType.ARRAY;
//	}

	public String getToken() {
		return GrammarTokens.ARRAY_GET;
	};
	
	@Override
	public Class<? extends T> type() {
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
//		return new ArrayIterable<E>(valArray);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
	
	

	class ArrayIterable implements Iterable<T> {
		T[] valArray;
		
		public ArrayIterable(T[] valArray) {
			super();
			this.valArray = valArray;
		}

		@Override
		public Iterator<T> iterator() {
			return new ArrayIterator(valArray);
		}		
	}

	class ArrayIterator implements Iterator<T> {
		T[] valArray;
		int index;
		
		public ArrayIterator(T[] valArray) {
			this.valArray = valArray;
		}

		@Override
		public boolean hasNext() {
			return index < valArray.length;
		}

		@Override
		public T next() {
			return valArray[index++];
		}
		
		@Override
		public void remove() {
			throw new EvalException(ArrayGettable.this, "ArrayIterator does not support removing element.");
		}
			
	}
}
