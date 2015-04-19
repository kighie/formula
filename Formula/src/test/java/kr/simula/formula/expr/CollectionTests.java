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
package kr.simula.formula.expr;

import java.math.BigDecimal;
import java.util.Arrays;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.RootContext;

import org.junit.Test;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class CollectionTests extends AbstractExpressionTests {

	@Test
	public void testArray(){
		Gettable<?> node = (Gettable<?>)buildExpression("=[1,2,3,4]");
		System.out.println(node);
		
		RootContext context = new RootContext();
		
//		for(int i=0;i<1000;i++){
//			System.out.println(Arrays.toString( (Object[])node.get(context) ));
//		}
		System.out.println(Arrays.toString( (Object[])node.get(context) ));
	}

	@Test
	public void testArrayRef(){
		Gettable<?> node = (Gettable<?>)buildExpression("=param[2] * 5");
		System.out.println(node.getExpression());
		RootContext context = new RootContext();
		context.setParameter("param", new BigDecimal[]{new BigDecimal(1), new BigDecimal(2), new BigDecimal(3),
				new BigDecimal(4), new BigDecimal(5)});
		System.out.println(node.get(context));
	}
	

	@Test
	public void testMap(){
		Node node = buildExpression("={ a:1, b:2, c:3 }");
		System.out.println(node);
	}
}
