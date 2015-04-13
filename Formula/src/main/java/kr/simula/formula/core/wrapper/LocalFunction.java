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
import kr.simula.formula.core.Function;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.RtException;
import kr.simula.formula.core.util.ValueTypeUtils;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class LocalFunction<O> extends AbstractBlock implements Function<O>{
	private static final long serialVersionUID = 1L;
	private Class<O> retType;
	private String name;
	private List<Ref> args;
	private ValueType valueType;
	private final QName returnValueKey;
	
	
	/**
	 * @param retType
	 * @param name
	 * @param args
	 */
	public LocalFunction(Class<O> retType, String name, List<Ref> args, QName returnValueKey) {
		this.retType = retType;
		this.name = name;
		this.args = args;
		this.valueType = ValueTypeUtils.getValueType(retType);
		this.returnValueKey = returnValueKey;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public ValueType valueType() {
		return valueType;
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
		buf.append(retType.getSimpleName()).append(" ").append(name).append("(");
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
		throw new RtException("LocalFunction#eval(Object[]) is not applicable.");
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
}
