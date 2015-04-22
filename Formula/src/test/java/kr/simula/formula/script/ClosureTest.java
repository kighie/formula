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
package kr.simula.formula.script;

import kr.simula.formula.core.RootContext;

import org.junit.Test;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ClosureTest extends AbstractScriptTests {

	@Test
	public void basic(){
		RootContext context = new RootContext();
		context.setParameter("sampleObject", new SampleObject());
		
		testBasic("/kr/simula/formula/script/Closure.fo",context);
	}
	

	@Test
	public void performance(){
		RootContext context = new RootContext();
		context.setParameter("sampleObject", new SampleObject());
		
		performanceTest("/kr/simula/formula/script/Closure.fo", 1000, context);
	}
	
}
