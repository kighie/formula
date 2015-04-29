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
package kr.simula.formula.script.statement;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.ref.DeclaredParameterRef;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class ParamDefStatement extends AbstractStatement {
	private DeclaredParameterRef<?> paramRef;
	
	/**
	 * @param varRef
	 * @param valueNode
	 */
	public ParamDefStatement(DeclaredParameterRef<?> paramRef) {
		this.paramRef = paramRef;
	}

	@Override
	public String getToken() {
		return GrammarTokens.PARAM_DECL_STMT;
	}
	
	public Class<?> type(){
		return paramRef.type();
	}
	
	
	@Override
	public void eval(Context context) {
		Object value = context.getReference(paramRef.qualifiedName());
		if(value == null) {
			throw new EvalException(this, "Parameter '" + paramRef.qualifiedName() + "' is not provided.");
		}
		
		if( !paramRef.type().isAssignableFrom( value.getClass() ) ){
			throw new EvalException(this, "Parameter '" + paramRef.qualifiedName() + "' is not "
					+ paramRef.type() );
		}
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("paramdef ").append(paramRef.type().getSimpleName()).append(" ").append(paramRef.getExpression());
		
		return buf.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("paramdef ").append(paramRef.toString());

		return buf.toString();
	}

}
