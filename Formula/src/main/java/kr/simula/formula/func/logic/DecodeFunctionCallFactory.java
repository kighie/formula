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
package kr.simula.formula.func.logic;

import java.util.HashMap;
import java.util.Map;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Literal;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.factory.func.ArgumentValidator;
import kr.simula.formula.core.factory.func.GenericFunctionCallFactory;
import kr.simula.formula.core.wrapper.FunctionCallWrapper;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class DecodeFunctionCallFactory extends GenericFunctionCallFactory {

	/**
	 * @param function
	 * @param validators
	 * @param bArgsLateEval
	 */
	public DecodeFunctionCallFactory(Function<?> function,
			ArgumentValidator<?>[] validators, boolean bArgsLateEval) {
		super(function, validators, bArgsLateEval);
	}

	@Override
	protected FunctionCallWrapper<?> createImpl(Function<?> function,
			Gettable<?>[] gettables) {
		Gettable<?> criteria = gettables[0];
		Map<Object, Gettable<?>> decisionMap = new HashMap<Object, Gettable<?>>();
		
		int length = gettables.length;
		int i=1;
		Gettable<?> when;
		Gettable<?> expr;
		
		for(;i<length;) {
			when = gettables[i++];
			expr = null;
			
			if( !(when instanceof Literal)){
				throw new BuildException("DECODE function works with literal value.");
			}
			
			if(i<length){
				expr = gettables[i];
			}
			
			decisionMap.put(when.get(null), expr);
			i++;
		}
		
		return new DecodeFunctionCallWrapper(function, gettables, criteria, decisionMap);
	}

	public static class DecodeFunctionCallWrapper extends FunctionCallWrapper<Object> {
		/**
		 * 
		 */
		private static final long serialVersionUID = -6704982909284986669L;
		private Map<Object, Gettable<?>> decisionMap;
		private Gettable<?> criteria;
		
		/**
		 * @param function
		 * @param args
		 * @param criteria 
		 */
		@SuppressWarnings("unchecked")
		public DecodeFunctionCallWrapper(Function<?> function,
				Gettable<?>[] args, Gettable<?> criteria, Map<Object, Gettable<?>> decisionMap) {
			super((Function<Object>)function, args);
			this.criteria = criteria;
			this.decisionMap = decisionMap;
		}
		
//		@Override
//		public ValueType valueType() {
//			return ValueType.OBJECT;
//		}
		
		@Override
		public Object get(Context context) {
			Object crit = criteria.get(context);
			Gettable<?> chosen = decisionMap.get(crit);
			if(chosen != null){
				return chosen.get(context);
			}
			return null;
		}
	}
	
}
