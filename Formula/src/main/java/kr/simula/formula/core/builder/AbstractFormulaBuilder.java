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
public abstract class AbstractFormulaBuilder<N extends Node, H extends FormulaHandler> 
	implements FormulaBuilder<N>, FormulaHandlerFactory<H> {
	

	protected final ParsingErrorAdapter errorAdapter = new ParsingErrorAdapter();
	

	public boolean addErrorListener(BuildErrorListener e) {
		return errorAdapter.addListener(e);
	}

	public boolean removeErrorListener(BuildErrorListener o) {
		return errorAdapter.removeListener(o);
	}

	
	
	@Override
	public H newHandler() {
		return newHandler(new RootBuildContext());
	}

	@Override
	public N build(String expression) {
		H handler = newHandler();
		return build(handler, expression);
	}
	
	@Override
	public N build(String expression, RootBuildContext rootContext) {
		H handler = newHandler(rootContext);
		return build(handler, expression);
	}
	
	protected abstract N build(H handler, String expression);
	
	
}
