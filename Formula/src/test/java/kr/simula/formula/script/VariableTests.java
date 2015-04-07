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
public class VariableTests extends AbstractScriptTests {


	static final String BASIC = "number number1 := 10;"
			+ "BigDecimal number2 := 30 * PA;"
			+ "Double number3 := number1/number2;"
			+ "if( not skipPrint) { System.out.println( 'SUM:' & number3); }";
	
	
	@Test
	public void basic(){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Script script = buildScript(BASIC);
		
		System.out.println(stopWatch.ellapsedTime());

		System.out.println(script);
		System.out.println(script.getExpression());
		
		stopWatch.reset();
		
		RootContext context = new RootContext();
		
		context.setReference(new QName(new QName("System"), "out"), System.out);
		context.setParameter("PA", new BigDecimal(6));

		script.eval(context);
		System.out.println(stopWatch.ellapsedTime());
		
		script.eval(context);
		System.out.println(stopWatch.ellapsedTime());
		
		context.setParameter("PA", new BigDecimal(3));
		
		script.eval(context);
		System.out.println(stopWatch.ellapsedTime());
		
		stopWatch.reset();
		
		context.setParameter("skipPrint", true);
		for(int i=0;i<1000;i++){
			script.eval(context);
		}
		
		System.out.println("1,000 times : " + stopWatch.ellapsedTime());

	}
}
