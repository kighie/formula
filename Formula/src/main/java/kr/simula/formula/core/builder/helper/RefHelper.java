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
package kr.simula.formula.core.builder.helper;

import java.util.List;
import java.util.Map;

import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.ref.ArrayElementRef;
import kr.simula.formula.core.ref.ElementRef;
import kr.simula.formula.core.ref.FieldRef;
import kr.simula.formula.core.ref.FunctionRef;
import kr.simula.formula.core.ref.MapEntryRef;
import kr.simula.formula.core.ref.ParameterRef;
import kr.simula.formula.core.ref.StaticFieldGettable;
import kr.simula.formula.core.ref.TypeRef;
import kr.simula.formula.core.util.GettableUtils;
import kr.simula.formula.core.util.RefUtils;

/**
 * <pre>
 * LiteralHelper creates Literal Nodes (string, number, boolean, date, etc.)
 * </pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class RefHelper {

	/**
	 * 
	 * <pre>
	 * </pre>
	 * @param context
	 * @param name
	 * @return
	 */
	public Ref get(BuildContext context, String name){
		QName qname = makeQName(context, name);
		Ref ref = context.getRef(qname);

		if(ref != null){
//			System.out.println("RefHelper#get cached ref=" + ref + "  " + ref.getClass() + "  " + ref.getLocation());
			return ref;
		}
		
		ref = newRef(context, null, qname);
		return ref;
	}

	
	/**
	 * TODO
	 * <pre>
	 * </pre>
	 * @param context
	 * @param parent
	 * @param name
	 * @return
	 */
	public Ref get(BuildContext context, Ref parent, String name){
		QName qname = makeQName(context, parent, name);
		Ref ref = context.getRef(qname);

		if(ref != null){
//			System.out.println("RefHelper#get cached ref=" + ref + "  " + ref.getClass());
			return ref;
		} 
		
		ref = newRef(context, parent, qname);

		return ref;
	}
	
	protected Ref newRef(BuildContext context, Ref parent, QName qname) {
		Ref ref = create(context, parent, qname);
		context.registerRef(qname, ref);
		return ref;
	}
	
	/**
	 * TODO method closure
	 * @param context
	 * @param parent
	 * @param qname
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Ref create(BuildContext context, Ref parent, QName qname){
		Ref newRef = null;
		if(parent != null){
			if( parent instanceof Gettable<?>){
//				System.out.println("RefHelper#create parent=" + parent 
//						+ "  " + parent.getClass() 
//						+ "  " + parent.getLocation());
//				
//				if(parent.type() != null && Record.class.isAssignableFrom(parent.type())){
//					System.out.println("RefHelper#create Record  parent=" + parent + " qname=" + qname);
//					System.out.println("\t" + context.references());
//				}
				
				newRef = new FieldRef(qname, (Gettable<?>)parent);
			} else if(parent instanceof TypeRef ){
				Object field = RefUtils.getStaticField(parent.type(), qname.getName());
				newRef = new StaticFieldGettable(qname, field);
			} else {
				throw new BuildException(qname + " cannot be unresolved.");
			}
			
		} else {
			Function<?> function = context.getLocalFn(qname.getName());
			if(function != null){
				FunctionRef closure = new FunctionRef(qname, function);
				newRef = closure;
			} else {
				newRef = new ParameterRef(qname);
			}
		}

		return newRef;
	}

	/**
	 * Build array/map reference 
	 * @param current
	 * @param parent
	 * @param index
	 * @return
	 */
	public Ref getIndexed(BuildContext context, Ref parent, Node index) {
		QName qname = makeQName(context, parent, index.toString());
		Ref ref = context.getRef(qname);

		if(ref != null){
			return ref;
		}
		
		return createIndexed(context, parent, index);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected Ref createIndexed(BuildContext context, Ref parent, Node index) {
		Ref newRef = null;
		QName parentQName = parent.qualifiedName();
		Class<?>parentType = parent.type();
		
//		System.out.println("RefHelper#getIndexed parent=" + parent 
//				+ "  " + parent.getClass()
//				+ " parentType=" + parentType);
		
		if(parentType == null){
			ElementRef elementRef = new ElementRef (parentQName, 
					GettableUtils.checkGettable(parent), 
					GettableUtils.checkGettable(index));
			newRef = elementRef;
		} else {
			if( Map.class.isAssignableFrom(parentType)){
				MapEntryRef  entryRef = new MapEntryRef (parentQName, 
						GettableUtils.checkGettable(parent), 
						GettableUtils.getStringGettable(index));
				newRef = entryRef;
			} else {
				if(parent.type().isArray() || List.class.isAssignableFrom(parentType)){
					ArrayElementRef elementRef = new ArrayElementRef (parentQName, 
							GettableUtils.checkGettable(parent), 
							GettableUtils.getDecimalGettable(index));
					newRef = elementRef;
				} else {
					ElementRef elementRef = new ElementRef (parentQName, 
							GettableUtils.checkGettable(parent), 
							GettableUtils.checkGettable(index));
					newRef = elementRef;
				}
			}
		}
		
		
		context.registerRef(new QName(parentQName, index.toString()), newRef);
		return newRef;
	}
	
	/**<pre>
	 * </pre>
	 * @param context
	 * @param parent
	 * @param name
	 */
	protected QName makeQName(BuildContext context, Ref parent, String name) {
		return new QName(parent.qualifiedName(), name);
	}

	/**
	 * TODO 
	 * <pre>
	 * </pre>
	 * @param context
	 * @param exprToken
	 * @param qname
	 * @return
	 */
	protected QName makeQName(BuildContext context, String name) {
		return new QName(name);
	}



	
	

//	/**<pre>
//	 * Build array reference 
//	 * </pre>
//	 * @param current
//	 * @param name
//	 * @param index
//	 * @return
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public Ref get(BuildContext current, String name, Node index) {
//		Ref parentCollection = get(current, name);
//		if( Map.class.isAssignableFrom(parentCollection.type())){
//			MapEntryRef  entryRef = new MapEntryRef (parentCollection.qualifiedName(), 
//					GettableUtils.checkGettable(parentCollection), 
//					GettableUtils.getStringGettable(index));
//			return entryRef;
//		} else {
//			ArrayElementRef elementRef = new ArrayElementRef (parentCollection.qualifiedName(), 
//					GettableUtils.checkGettable(parentCollection), 
//					GettableUtils.getDecimalGettable(index));
//			return elementRef;
//		}
//	}
//
//
//	/**<pre>
//	 * Build array reference
//	 * </pre>
//	 * @param current
//	 * @param parent
//	 * @param name
//	 * @param index
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public Ref get(BuildContext current, Ref parent, String name, Node index) {
//		Ref parentArray = get(current, parent, name);
//		ArrayElementRef elementRef = new ArrayElementRef (parentArray.qualifiedName(), 
//				GettableUtils.checkGettable(parentArray), GettableUtils.checkGettable(index,Number.class));
//		return elementRef;
//	}

}
