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
package kr.simula.formula.core.builder;

import kr.simula.formula.core.Node;
import kr.simula.formula.core.antlr.ParsingErrorAdapter;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractFormulaBuilder<T extends FormulaHandler> 
	implements FormulaBuilder, FormulaHandlerFactory<T> {
	

	protected final ParsingErrorAdapter errorAdapter = new ParsingErrorAdapter();
	

	public boolean addErrorListener(BuildErrorListener e) {
		return errorAdapter.addListener(e);
	}

	public boolean removeErrorListener(BuildErrorListener o) {
		return errorAdapter.removeListener(o);
	}

	
	
	@Override
	public T newHandler() {
		return newHandler(new RootBuildContext());
	}

	@Override
	public Node build(String expression) {
		T handler = newHandler();
		return build(handler, expression);
	}
	
	@Override
	public Node build(String expression, RootBuildContext rootContext) {
		T handler = newHandler(rootContext);
		return build(handler, expression);
	}
	
	protected abstract Node build(T handler, String expression);
	
	
}
