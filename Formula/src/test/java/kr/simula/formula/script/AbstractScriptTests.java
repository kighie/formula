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

import java.io.File;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.RootContext;
import kr.simula.formula.core.builder.FormulaSource;
import kr.simula.formula.script.build.FormulaScriptBuilder;
import kr.simula.formula.util.StopWatch;

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
		builder.initialize();
	}
	
	protected void testBasic(String scriptFilePath){
		testBasic(scriptFilePath, new RootContext());
	}
	
	protected void testBasic(String scriptFilePath, RootContext context){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Module script = buildFromFile(scriptFilePath);
		
		System.out.println(scriptFilePath);
		System.out.println(script.getExpression());
		System.out.println("BUILD Time : " + stopWatch.ellapsedTime());
		
		stopWatch.reset();
		
		//context.setReference(new QName(new QName("System"), "out"), System.out);
		
		script.eval(context);
		
		System.out.println("Running Time : " + stopWatch.ellapsedTime());
	}


	public void performanceTest(String scriptFilePath, int loopCount, RootContext context){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Module script = buildFromFile(scriptFilePath);
		
		System.out.println(script.getExpression());
		System.out.println("BUILD Time : " + stopWatch.ellapsedTime());
		
		stopWatch.reset();
		
		context.setReference(new QName(new QName("System"), "out"), System.out);
		context.setParameter("skipPrint", true);
		
		for(int i=0;i<loopCount;i++){
			script.eval(context);
		}
		
		
		System.out.println("Running " + loopCount + " Times : " + stopWatch.ellapsedTime());
		
	}
	

	public void performanceTest(String scriptFilePath, int loopCount){
		performanceTest(scriptFilePath, loopCount, new RootContext());
	}
	
	
	protected Module buildScript(String expr){
		Module exprNode = (Module)builder.build(expr);
		return exprNode;
	}

	protected Module buildFromFile(File file){
		FormulaSource source = FormulaSource.newSource(file.getPath(), file);
		Module exprNode = (Module)builder.build(source);
		return exprNode;
	}

	protected Module buildFromFile(String filePath){
		FormulaSource source = FormulaSource.newSource(filePath, 
				getClass().getResourceAsStream(filePath), "UTF-8");
		Module exprNode = (Module)builder.build(source);
		return exprNode;
	}

	protected void testScript(String expr){
		eval(expr, null);
	}


	protected void testScript(String expr, Context context){
		eval(expr, context);
	}

	protected void eval(String expr, Context context){
		Node exprNode = builder.build(expr);
		System.out.println();
		System.out.println(exprNode.getExpression());
		System.out.println(exprNode);
		
		Module script = (Module)exprNode;
		
		script.eval(context);
	}
	
}
