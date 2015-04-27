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
package kr.simula.formula.util;

import java.math.BigDecimal;

import kr.simula.formula.core.util.ArrayUtils;

import org.jscience.mathematics.number.Real;
import org.junit.Test;

import cern.colt.Arrays;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class Tests {

	@Test
	public void testArrayUtils(){
		Object[] array = new Object[]{ new BigDecimal(1), new BigDecimal(2), 
				new BigDecimal[]{new BigDecimal(11), new BigDecimal(12), new BigDecimal(13)} ,
				new BigDecimal(3)
		};
		
		BigDecimal[] newArr = ArrayUtils.copyOf(array, BigDecimal[].class);
		
		System.out.println(Arrays.toString(newArr));
	}
	
	
	@Test
	public void test(){
		try {
			Class<?> type = Class.forName("[Ljava.lang.String;");
			
			System.out.println(type.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void val(){
		
		Real real = Real.valueOf((double)13/11);
		
		System.out.println(real);

		BigDecimal dec = new BigDecimal((double)13/11);
		System.out.println(dec);
		
		so.ontolog.data.type.Real freal = new so.ontolog.data.type.Real((double)13/11);
		System.out.println(freal);
	}

	@Test
	public void real(){
		for(int i=0;i<100000;i++){

			Real real = Real.valueOf((double)13/11);
//			System.out.println(real);
		}
		
	}

	@Test
	public void bigdecimal(){
		for(int i=0;i<100000;i++){

			BigDecimal real = new BigDecimal((double)13/11);
			System.out.println(real);
		}
		
	}
	

	@Test
	public void freal(){
		for(int i=0;i<100000;i++){

			so.ontolog.data.type.Real real = new so.ontolog.data.type.Real((double)13/11);
			System.out.println(real);
		}
		
	}
}
