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

import kr.simula.formula.core.Context;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class FunctionCallWrapper<T> extends AbstractNode implements Gettable<T>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5763726567208260517L;
	protected final Function<T> function;
	protected final Gettable<?>[] args;
	protected boolean bArgsLateEval;
	
	/**
	 * @param function
	 */
	public FunctionCallWrapper(Function<T> function, Gettable<?> ... args) {
		this.function = function;
		this.args = args;
	}

	@Override
	public String getToken() {
		return GrammarTokens.FUNC_CALL;
	}
	
	/**
	 * @return the bArgsLateEval
	 */
	public boolean isArgsLateEval() {
		return bArgsLateEval;
	}

	/**
	 * @param bArgsLateEval the bArgsLateEval to set
	 */
	public void setArgsLateEval(boolean bArgsLateEval) {
		this.bArgsLateEval = bArgsLateEval;
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("(").append(getFunctionName());
		for(Gettable<?> n : args){
			buf.append(" ").append(n.getExpression());
		}
		buf.append(")");
		
		return buf.toString();
	}
	
	protected String getFunctionName(){
		return function.getClass().getSimpleName();
	}
	
	@Override
	public Class<? extends T> type() {
		return function.getReturnType();
	}
	

	/**
	 * TODO Change arguments manipulating (using bytecode engineering)
	 */
	@Override
	public T get(Context context) {
		if(bArgsLateEval){
			return function.eval(context, args);
		}
		
		Object[] argArr = new Object[args.length];
		int i = 0;
		for(Gettable<?> n : args){
			argArr[i++] = n.get(context);
		}
		try {
			return function.eval(argArr);
		} catch (Exception e) {
			throw new EvalException(this, e);
		}
	}

	@Override
	public String toString(){
		StringBuilder buf = new StringBuilder();
		buf.append("(").append(function.getClass().getName());
		for(Gettable<?> n : args){
			buf.append(" ").append(n.toString());
		}
		buf.append(")");
		
		return buf.toString();
	}
	
}
