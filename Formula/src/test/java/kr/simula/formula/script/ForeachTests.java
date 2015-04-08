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

import java.math.BigDecimal;

import kr.simula.formula.core.QName;
import kr.simula.formula.core.RootContext;
import kr.simula.formula.util.StopWatch;

import org.junit.Test;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ForeachTests extends AbstractScriptTests {

	static final String BASIC 
			= "foreach(int a = 1:10) {"
			+ "	number num := a * 10; "
			+ "	number total := num * PA / 11; "
			+ "	if( not skipPrint and MOD(a,3) is not 1) { "
			+ "		System.out.println( a & ':' & total ); "
			+ "	}"
			+ "}";
	
	@Test
	public void basic(){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Script script = buildScript(BASIC);
		
		System.out.println(script.getExpression());
		System.out.println("BUILD Time : " + stopWatch.ellapsedTime());
		
		stopWatch.reset();
		
		RootContext context = new RootContext();
		
		context.setReference(new QName(new QName("System"), "out"), System.out);
		context.setParameter("PA", new BigDecimal(131));
		
		script.eval(context);
		
		System.out.println("Running Time : " + stopWatch.ellapsedTime());
		
	}
	

	@Test
	public void performance(){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Script script = buildScript(BASIC);
		
		System.out.println(script.getExpression());
		System.out.println("BUILD Time : " + stopWatch.ellapsedTime());
		
		stopWatch.reset();
		
		RootContext context = new RootContext();
		
		context.setReference(new QName(new QName("System"), "out"), System.out);

		context.setParameter("PA", new BigDecimal(20));
		context.setParameter("skipPrint", true);
		
		
		for (int i = 0; i < 1000; i++) {
			script.eval(context);
		}
		System.out.println("Running 1,000 Times : " + stopWatch.ellapsedTime());
		
	}
}
