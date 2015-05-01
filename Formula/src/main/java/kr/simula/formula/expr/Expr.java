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
package kr.simula.formula.expr;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.SourceLocation;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class Expr implements Gettable<Object>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8479827209570185436L;
	private Gettable<?> body;
	
	
	/**
	 * @param body
	 */
	public Expr(Gettable<?> body) {
		super();
		this.body = body;
	}

//	@Override
//	public ValueType valueType() {
//		return body.valueType();
//	}

	@Override
	public String getToken() {
		return body.getToken();
	}
	
	@Override
	public SourceLocation getLocation() {
		return body.getLocation();
	}
	
	@Override
	public Node setLocation(SourceLocation location) {
		return body.setLocation(location);
	}
	
	@Override
	public String getExpression() {
		return "=" + body.getExpression();
	}

	@Override
	public Class<? extends Object> type() {
		return body.type();
	}
	
	@Override
	public Object get(Context context) {
		return body.get(context);
	}

	@Override
	public String toString() {
		return "=" + body.toString();
	}
}
