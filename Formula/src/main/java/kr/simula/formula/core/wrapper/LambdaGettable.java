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
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Lambda;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.SourceLocation;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
@SuppressWarnings("rawtypes")
public class LambdaGettable implements  Gettable<Lambda>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4166307450722262006L;
	private Lambda lambda;
	
	/**
	 * @param retType
	 * @param name
	 * @param args
	 */
	public LambdaGettable(Lambda lambda) {
		this.lambda = lambda;
	}
	
	@Override
	public String getToken() {
		return GrammarTokens.LAMBDA;
	}
	
	@Override
	public String getExpression() {
		return lambda.toString();
	}
	

	
	@Override
	public String toString() {
		return lambda.toString();
	}

	@Override
	public SourceLocation getLocation() {
		return lambda.getLocation();
	}

	@Override
	public Node setLocation(SourceLocation location) {
		return lambda.setLocation(location);
	}

	@Override
	public Class<Lambda> type() {
		return Lambda.class;
	}

	@Override
	public Lambda get(Context context) {
		return lambda;
	}
}
