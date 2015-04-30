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
package kr.simula.formula.core.builder.helper;

import java.util.List;

import kr.simula.formula.core.Lambda;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.factory.LambdaFactory;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class LambdaHelper extends AbstractHelper<LambdaFactory> {

	/**<pre>
	 * </pre>
	 * @param current
	 * @param token
	 * @param args
	 * @param infos
	 * @return
	 */
	public Lambda<?> create(BuildContext current, String token, List<Ref> args, Object ... extra) {
		LambdaFactory factory = factories.get(token);
		if(factory == null){
			throw new BuildException("LambdaFactory for " + token + " is not registered.");
		}
		return factory.create(current, token, args, extra);
	}

}
