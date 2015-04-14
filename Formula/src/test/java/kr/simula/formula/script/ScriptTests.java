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
import kr.simula.formula.func.base.MathFunctions;
import kr.simula.formula.util.StopWatch;

import org.junit.Test;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ScriptTests extends AbstractScriptTests {

	@Test
	public void script1(){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Module script = buildFromFile("/kr/simula/formula/script/ScriptTest1.fo");
		
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
	public void script1_performance(){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Module script = buildFromFile("/kr/simula/formula/script/ScriptTest1.fo");
		
		System.out.println(script.getExpression());
		System.out.println("BUILD Time : " + stopWatch.ellapsedTime());
		
		stopWatch.reset();
		
		RootContext context = new RootContext();
		
		context.setReference(new QName(new QName("System"), "out"), System.out);
		context.setParameter("skipPrint", true);
		
		for (int i = 0; i < 10000; i++) {
			context.setParameter("PA", new BigDecimal(i));
			script.eval(context);
		}
		
		System.out.println("Running 10,000 Times : " + stopWatch.ellapsedTime());
		
	}
	

	@Test
	public void script1_java_performance(){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		BigDecimal num = new BigDecimal(23);
		
		for (int i = 0; i < 10000; i++) {
			BigDecimal var = new BigDecimal(i);
			javaCode1(var, num);
			javaCode1( num, var);
			javaCode2();
		}
		
		System.out.println("Java Running 10,000 Times : " + stopWatch.ellapsedTime());
		
	}
	
	private BigDecimal javaCode1(BigDecimal argA, BigDecimal argB){
		BigDecimal retVal;
		
		if(argA.compareTo(argB) > 0) {
			javaCode3(argA + "x" + argB);
			retVal = MathFunctions.ceiling(argA.multiply( argB), new BigDecimal(3)) ;
		} else {
			javaCode3(argA + "+" + argB);
			retVal = MathFunctions.log( argA.add( argB) ); 
		}
		
		return retVal;
	}


	private void javaCode2(){
		javaCode3("void return, empty args."); 
	}

	private void javaCode3(Object value){
		boolean skipPrint = true;
		if(!skipPrint) {
			System.out.println(value); 
		}
		
	}
}
