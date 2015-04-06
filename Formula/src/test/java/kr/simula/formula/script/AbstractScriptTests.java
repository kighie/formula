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

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.script.build.FormulaScriptBuilder;

import org.junit.Assert;
import org.junit.BeforeClass;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public abstract class AbstractScriptTests {

	protected static FormulaScriptBuilder builder;
	
	@BeforeClass
	public static void setUp(){
		builder = new FormulaScriptBuilder();
	}
	

	protected Node buildScript(String expr){
		Node exprNode = builder.build(expr);
		return exprNode;
	}

	protected void testScript(String expr, Object expected){
		testScript(expr, null, expected);
	}

	protected void testScript(String expr, Context context, Object expected){
		Object result = eval(expr, context);
		System.out.println(result);
		
		Assert.assertEquals(expected, result);
	}
	
	protected Object eval(String expr, Context context){
		Node exprNode = builder.build(expr);
		System.out.println();
		System.out.println(exprNode.getExpression());
		System.out.println(exprNode);
		
		Gettable<?> gettable = (Gettable<?>)exprNode;
		
		Object result = gettable.get(context);
		
		return result;
	}
	
}
