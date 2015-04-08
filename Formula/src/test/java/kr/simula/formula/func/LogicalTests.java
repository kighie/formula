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
package kr.simula.formula.func;

import java.math.BigDecimal;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.RootContext;
import kr.simula.formula.expr.AbstractExpressionTests;
import kr.simula.formula.util.StopWatch;

import org.junit.Test;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class LogicalTests  extends AbstractExpressionTests {

	@Test
	public void AND(){
		testExpression("=AND(true, true, false)", false);
	}

	@Test
	public void OR(){
		testExpression("=OR(false, false, false, true)", true);
	}

	@Test
	public void IF(){
		testExpression("=IF(true, 'YES', 'NO')", "YES");
		testExpression("=IF(false, 'YES', 'NO')", "NO");
		testExpression("=IF(false, 10, 20)", new BigDecimal(20));
		testExpression("=IF(true, 10, 20) * 10", new BigDecimal(100));
	}

	@Test
	public void DECODE(){
		String expr = "=DECODE(pA, "
				+ "1, A1, "
				+ "2, 'RTN'& pA, "
				+ "3, pA*4,"
				+ "4, 'CAL-' & pA/6, "
				+ "5, pA^2,"
				+ "6, 2*pA, "
				+ "7, MOD(pA,2),"
				+ "8  )";
		
		RootContext context = new RootContext();
		context.setParameter("A1", "abcd");

		context.setParameter("pA", 1);
		testExpression(expr, context, "abcd");

		context.setParameter("pA", 2);
		testExpression(expr, context, "RTN2");

		context.setParameter("pA", 3);
		testExpression(expr, context, new BigDecimal(12));
		
		context.setParameter("pA", 4);
		testExpression(expr, context, "CAL-0.6666666667");

		context.setParameter("pA", 5);
		testExpression(expr, context, new BigDecimal(25));

		context.setParameter("pA", 6);
		testExpression(expr, context, new BigDecimal(12));

		context.setParameter("pA", 7);
		testExpression(expr, context, new BigDecimal(1));

		context.setParameter("pA", 8);
		testExpression(expr, context, null);

	}


	@Test
	public void DECODE_Performance(){
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		String expr = "=DECODE(pA, "
				+ "1, 'A1', "
				+ "2, 'RTN'& pA, "
				+ "3, pA*4,"
				+ "4, 'CAL-' & pA/6, "
				+ "5, pA^2,"
				+ "6, 2*pA, "
				+ "7, MOD(pA,2),"
				+ "8  )";
		
		Gettable<?> node = (Gettable<?>)buildExpression(expr);
		
		System.out.println("BUILD : " + stopWatch.ellapsedTime());
		
		System.out.println(node.getExpression());
		
		RootContext context = new RootContext();
		
		stopWatch.reset();
		
		for (int i = 0; i < 1000; i++) {
			context.setParameter("pA", 1);
			node.get(context);
			context.setParameter("pA", 2);
			node.get(context);
			context.setParameter("pA", 3);
			node.get(context);
			context.setParameter("pA", 4);
			node.get(context);
			context.setParameter("pA", 5);
			node.get(context);

			context.setParameter("pA", 6);
			node.get(context);
			context.setParameter("pA", 7);
			node.get(context);
			context.setParameter("pA", 8);
			node.get(context);
		}
		
		System.out.println("RUN 1,000times : " + stopWatch.ellapsedTime());
	}

	
	@Test
	public void test(){
		testExpression("=(1+3 * (4 - 15) - 31.5 / 10)/100", new BigDecimal("-0.3515"));
		
		System.out.println((1+3 * (4 - 15) - 31.5 / 10)/100);
	}
}
