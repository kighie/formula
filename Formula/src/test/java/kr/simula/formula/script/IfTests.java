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
public class IfTests extends AbstractScriptTests {

	static final String IF_BASIC = "if(PA=1) { System.out.println(\"PA==>1\"); } "
			+ "elseif(PA=3){ System.out.println(\"PA=\" & (PA * 10)); } "
			+ "elseif(PA=5) { System.out.println((PA+33) / 13); } "
			+ "else { System.out.println( PA ); }";
	
	@Test
	public void basic(){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Script script = buildScript(IF_BASIC);
		
		System.out.println(script.getExpression());
		System.out.println(stopWatch.ellapsedTime());
		
		RootContext context = new RootContext();
		
		context.setReference(new QName(new QName("System"), "out"), System.out);
		context.setParameter("PA", new BigDecimal(1));
		
		script.eval(context);
		
		System.out.println(stopWatch.ellapsedTime());
		
		
		context.setParameter("PA", new BigDecimal(3));
		
		script.eval(context);

		System.out.println(stopWatch.ellapsedTime());
		
		context.setParameter("PA", new BigDecimal(5));
		
		script.eval(context);

		System.out.println(stopWatch.ellapsedTime());
		
		context.setParameter("PA", 10);
		script.eval(context);
		System.out.println(stopWatch.ellapsedTime());
	}
}
