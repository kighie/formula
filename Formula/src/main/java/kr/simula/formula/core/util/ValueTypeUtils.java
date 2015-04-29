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
package kr.simula.formula.core.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import kr.simula.formula.core.EvalException;


/**
 * TODO property set/get tuning
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class ValueTypeUtils {

	public static Object convertPrimitive(Object value, Class<?> type){
		if(value == null){
			return 0;
		}
		
		if( char.class.isAssignableFrom(type)){
			return value.toString().charAt(0);
		} else if( byte.class.isAssignableFrom(type)){
			return value.toString().charAt(0);
		} else {
			if( !(value instanceof BigDecimal) ) {
				value = new BigDecimal(value.toString());
			}
			
			BigDecimal number = (BigDecimal)value;
			
			if(int.class.isAssignableFrom(type)){
				return number.intValue();
			} else if(long.class.isAssignableFrom(type)){
				return number.longValue();
			} else if(float.class.isAssignableFrom(type)){
				return number.floatValue();
			} else if(double.class.isAssignableFrom(type)){
				return number.doubleValue();
			}
		}
		
		throw new EvalException("TODO : bean property converting mechanism.");
	}
	
	public static Object convert(Object value, Class<?> type){
		if(type.isPrimitive()){
			return convertPrimitive(value, type);
		}
		
		if(value == null){
			return null;
		}
		
		if(Number.class.isAssignableFrom(type)){
			if( !(value instanceof BigDecimal) ) {
				value = new BigDecimal(value.toString());
			}
			BigDecimal number = (BigDecimal)value;
			
			if(BigDecimal.class.isAssignableFrom(type) ) {
				return number;
			} else if(Integer.class.isAssignableFrom(type) ){
				return number.intValue();
			} else if(Double.class.isAssignableFrom(type) ){
				return number.doubleValue();
			} else if(BigInteger.class.isAssignableFrom(type) ){
				return BigInteger.valueOf(number.longValue());
			} else if(Float.class.isAssignableFrom(type) ){
				return number.floatValue();
			} else if(Long.class.isAssignableFrom(type) ){
				return number.longValue();
			}
		} else if(String.class.isAssignableFrom(type)){
			return value.toString();
		}
		
		throw new EvalException("TODO : bean property converting mechanism.");
	}
}
