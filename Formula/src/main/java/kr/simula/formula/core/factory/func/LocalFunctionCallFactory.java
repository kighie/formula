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
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.factory.FunctionCallFactory;
import kr.simula.formula.core.util.GettableUtils;
import kr.simula.formula.core.wrapper.LocalFunction;
import kr.simula.formula.core.wrapper.LocalFunctionCallWrapper;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class LocalFunctionCallFactory implements FunctionCallFactory {
	
	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Gettable<?> create(BuildContext context, String fnName,
			List<Node> args) {
		Function<?> function = context.getLocalFn(fnName);
		
		if(function == null){
			throw new BuildException("Local Function(" + fnName + ") is not registered.");
		}

		List<Ref> argRefs = null;
		
		if(function instanceof LocalFunction){
			argRefs = ((LocalFunction)function).getArgs();
		}
		
		int argCount = (args != null) ? args.size() : 0;
		int refCount = (argRefs != null) ? argRefs.size() : 0;
		
		if(argCount != refCount){
			throw new BuildException("Local Function(" + fnName + ") is not registered.");
		}
		
		Gettable<?>[] gettables = new Gettable<?>[refCount];
		
		for(int i =0;i< refCount;i++){
			Ref r = argRefs.get(i);
			gettables[i] = GettableUtils.checkGettable(args.get(i), r.type());
		}
		
		LocalFunctionCallWrapper<?> wrapper = new LocalFunctionCallWrapper(function,gettables) ;
		return wrapper;
	}
	
	
	
}
