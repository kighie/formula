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

import java.util.List;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Lambda;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.Returnable;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class LambdaFunction<O> extends AbstractBlock implements Lambda, Returnable {
	private static final long serialVersionUID = 1L;
	private Class<O> retType;
	private String name;
	private List<Ref> args;
	private final QName returnValueKey;
	
	
	/**
	 * @param retType
	 * @param name
	 * @param args
	 */
	public LambdaFunction(Class<O> retType, List<Ref> args, QName returnValueKey) {
		this.retType = retType;
		this.name = "lambda" + hashCode();
		this.args = args;
		this.returnValueKey = returnValueKey;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String getToken() {
		return GrammarTokens.LAMBDA;
	}
	
	@Override
	public Class<O> getReturnType() {
		return retType;
	}
	
	/**
	 * @return the args
	 */
	public List<Ref> getArgs() {
		return args;
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("lambda ").append(retType.getSimpleName()).append(" ").append(name).append("(");
		for(Ref n : args){
			buf.append(" ").append(n.getExpression());
		}
		buf.append(") {");
		getBodyExpression(buf);
		buf.append("}");
		return buf.toString();
	}
	

	@Override
	public O eval(Object... args) {
		throw new EvalException(this, "LambdaFunction#eval(Object[]) is not applicable.");
	}

	@Override
	public O evalFunc(Context context) {
		eval(context);
		return getReturnValue(context);
	}
	
	@Override
	public void eval(Context context) {
		evalBody(context);
	}
	
	@SuppressWarnings("unchecked")
	public O getReturnValue(Context context){
		O value = (O)context.getReference(returnValueKey);
		return value;
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("[lambda ");
		buf.append(retType.getSimpleName()).append(" ").append(name).append("(");
		for(Ref n : args){
			buf.append(" ").append(n.getExpression());
		}
		buf.append(")]");
		return buf.toString();
	}
	
	@Override
	public QName getReturnValueKey() {
		return returnValueKey;
	}
}
