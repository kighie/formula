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

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.lang.model.type.NullType;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Literal;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public abstract class AbstractLiteral<T> extends AbstractNode implements Literal<T>{
	private static final long serialVersionUID = 473383319479443064L;

	public static final Literal<Object> NULL = new AbstractLiteral<Object>(null){
		private static final long serialVersionUID = -7718728325262030420L;

		@Override
		public String getToken() {
			return GrammarTokens.LIT_NULL;
		}
		
		@Override
		public Class<? extends Object> type() {
			return NullType.class;
		}
	};
	
	protected T value;
	
	
	/**
	 * @param value
	 */
	public AbstractLiteral(T value) {
		this.value = value;
	}

	@Override
	public T getValue(){
		return value;
	}
	
	@Override
	public T get(Context context) {
		return value;
	}
	
	@Override
	public String getExpression() {
		return value.toString();
	}
	
	@Override
	public String toString() {
		return value.toString();
	}

	public static class StringLiteral extends AbstractLiteral<String> {
		private static final long serialVersionUID = -9087887733634147019L;

		public StringLiteral(String value) {
			super(value);
		}

//		@Override
//		public ValueType valueType() {
//			return ValueType.TEXT;
//		}
		
		@Override
		public Class<String> type() {
			return String.class;
		}
		

		@Override
		public String getExpression() {
			return "'" + value + "'";
		}
		
		@Override
		public String toString() {
			return "'" + value + "'";
		}

		@Override
		public String getToken() {
			return GrammarTokens.LIT_STRING;
		}
		
	}
	

	public static class NumberLiteral extends AbstractLiteral<BigDecimal> {

		private static final long serialVersionUID = 641298535480157623L;
		public final static NumberLiteral ZERO = new NumberLiteral(BigDecimal.ZERO);
		public final static NumberLiteral ONE = new NumberLiteral(BigDecimal.ONE);
		public final static NumberLiteral TWO = new NumberLiteral(new BigDecimal(2));
		public final static NumberLiteral THREE = new NumberLiteral(new BigDecimal(3));
		public final static NumberLiteral FOUR = new NumberLiteral(new BigDecimal(4));
		public final static NumberLiteral FIVE = new NumberLiteral(new BigDecimal(5));
		public final static NumberLiteral SIX = new NumberLiteral(new BigDecimal(6));
		public final static NumberLiteral SEVEN = new NumberLiteral(new BigDecimal(7));
		public final static NumberLiteral EIGHT = new NumberLiteral(new BigDecimal(8));
		public final static NumberLiteral NINE = new NumberLiteral(new BigDecimal(9));
		public final static NumberLiteral TEN = new NumberLiteral(BigDecimal.TEN);
		
		static final Map<String, NumberLiteral> map = new HashMap<String, AbstractLiteral.NumberLiteral>();
		static {
			map.put("0", ZERO);
			map.put("1", ONE);
			map.put("2", TWO);
			map.put("3", THREE);
			map.put("4", FOUR);
			map.put("5", FIVE);
			map.put("6", SIX);
			map.put("7", SEVEN);
			map.put("8", EIGHT);
			map.put("9", NINE);
			map.put("10", TEN);
		}

		public static NumberLiteral parseLiteral(String value) {
			NumberLiteral literal = map.get(value);
			if(literal == null){
				literal = new NumberLiteral(new BigDecimal(value));
			}
			return literal;
		}

		public static NumberLiteral parseLiteral(int value) {
			NumberLiteral literal = map.get(Integer.toString(value));
			if(literal == null){
				literal = new NumberLiteral(new BigDecimal(value));
			}
			return literal;
		}
		
		public NumberLiteral(BigDecimal value) {
			super(value);
		}

//		@Override
//		public ValueType valueType() {
//			return ValueType.NUMERIC;
//		}

		@Override
		public String getToken() {
			return GrammarTokens.LIT_NUMBER;
		}
		
		@Override
		public Class<BigDecimal> type() {
			return BigDecimal.class;
		}
		
	}

	public static class BooleanLiteral extends AbstractLiteral<Boolean> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 3826493857572646576L;
		public static final BooleanLiteral TRUE = new BooleanLiteral(true);
		public static final BooleanLiteral FALSE = new BooleanLiteral(false);
		
		public BooleanLiteral(Boolean value) {
			super(value);
		}

//		@Override
//		public ValueType valueType() {
//			return ValueType.LOGICAL;
//		}

		@Override
		public Class<Boolean> type() {
			return Boolean.class;
		}

		@Override
		public String getToken() {
			return GrammarTokens.LIT_BOOLEAN;
		}
		
	}

	public static class DateLiteral extends AbstractLiteral<Date> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 8405918607730594670L;
		private static final DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		public DateLiteral(Date value) {
			super(value);
		}

		public DateLiteral(String value) throws ParseException {
			super(formatter.parse(value));
		}

//		@Override
//		public ValueType valueType() {
//			return ValueType.DATE;
//		}

		@Override
		public String getToken() {
			return GrammarTokens.LIT_DATE;
		}
		
		@Override
		public Class<Date> type() {
			return Date.class;
		}
		
	}
}
