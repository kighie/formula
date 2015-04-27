package kr.simula.formula.script;

import kr.simula.formula.core.RootContext;

import org.junit.Test;

public class ExceptionTests extends AbstractScriptTests {

	@Test
	public void basic(){
		RootContext context = new RootContext();
		context.setParameter("sampleObject", new SampleObject());
		
//		testBasic("/kr/simula/formula/script/ExceptionTest.fo",context);
	}
	
}
