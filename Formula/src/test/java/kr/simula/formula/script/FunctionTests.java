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

import kr.simula.formula.core.QName;
import kr.simula.formula.core.RootContext;
import kr.simula.formula.util.StopWatch;

import org.junit.Test;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class FunctionTests  extends AbstractScriptTests {

	
	@Test
	public void mathFunctions(){
		testImpl("/kr/simula/formula/script/MathFuncTest.fo");
	}
	
	private void testImpl(String filePath) {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Module script = buildFromFile(filePath);
		
		System.out.println(script.getExpression());
		System.out.println("BUILD Time : " + stopWatch.ellapsedTime());
		
		stopWatch.reset();
		
		RootContext context = new RootContext();
		
		context.setReference(new QName(new QName("System"), "out"), System.out);
		
		script.eval(context);
		
		System.out.println("Running Time : " + stopWatch.ellapsedTime());
	}
}
