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
package kr.simula.formula.core.factory.func;

import java.util.List;

import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.factory.FunctionCallFactory;
import kr.simula.formula.core.ref.ClosureRef;
import kr.simula.formula.core.util.GettableUtils;
import kr.simula.formula.core.wrapper.ClosureCallWrapper;
import kr.simula.formula.core.wrapper.LocalFunction;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ClosureCallFactory implements FunctionCallFactory {
	
	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Gettable<?> create(BuildContext context, String fnName,
			List<Node> args) {
		
		ClosureRef closureRef = (ClosureRef)context.getRef(QName.getClosureQName(fnName));
		
		if(closureRef == null){
			throw new BuildException("Closure '" + fnName + "' is not found.");
		}
		
		int argCount = (args != null) ? args.size() : 0;
		
		Gettable<?>[] gettables = new Gettable<?>[argCount];
		
		for(int i =0;i< argCount;i++){
			Node a = args.get(i);
			gettables[i] = GettableUtils.checkGettable(a);
		}
		
		ClosureCallWrapper<?> wrapper = new ClosureCallWrapper(closureRef,gettables) ;
		return wrapper;
	}
	
	
	
}
