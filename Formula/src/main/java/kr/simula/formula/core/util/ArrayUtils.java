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
package kr.simula.formula.core.util;

import java.lang.reflect.Array;
import java.util.Arrays;

import kr.simula.formula.core.builder.BuildException;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ArrayUtils {

	@SuppressWarnings("unchecked")
	public static <T> Class<T[]> getArrayClass(Class<T> elementType){
		try {
			return (Class<T[]>)Class.forName("[L" + elementType.getName() + ";");
		} catch (ClassNotFoundException e) {
			throw new BuildException(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[] copyOf(Object[] args, Class<T[]> type){
		int length = 0;
		for(Object o : args){
			if(o.getClass().isArray()){
				length += ((Object[])o).length;
			} else {
				length++;
			}
		}
		
		if(args.length == length){
			return Arrays.copyOf(args, length, type);
		}
		
		T[] array = (T[])Array.newInstance(type.getComponentType(), length);

		int index=0;

		for(Object o : args){
			if(o.getClass().isArray()){
				Object[] arr = (Object[])o;
				System.arraycopy(arr, 0, array, index,arr.length);
				index += arr.length;
			} else {
				array[index++] = (T)o;
			}
		}
		
		return array;
	}
}
