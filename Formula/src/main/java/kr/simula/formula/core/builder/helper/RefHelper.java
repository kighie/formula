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
		if(parent != null){
			if( parent instanceof Gettable<?>){
				return new FieldRef(qname, (Gettable<?>)parent);
			} else if(parent instanceof TypeRef ){
				Object field = RefUtils.getStaticField(parent.type(), qname.getName());
				return new StaticFieldGettable(qname, field);
			} else {
				throw new BuildException(qname + " cannot be unresolved.");
			}
			
		} else {
			Function<?> function = context.getLocalFn(qname.getName());
			if(function != null){
				FunctionRef closure = new FunctionRef(qname, function);
				return closure;
			} else {
				return new ParameterRef(qname);
			}
		}
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



	/**
	 * Build array/map reference 
	 * @param current
	 * @param parent
	 * @param index
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Ref getIndexed(BuildContext current, Ref parent, Node index) {
		
		if(parent.type() == null){
			System.out.println("### getIndexed :: parent=" + parent + "  " + parent.getClass());
		}
		if( Map.class.isAssignableFrom(parent.type())){
			MapEntryRef  entryRef = new MapEntryRef (parent.qualifiedName(), 
					GettableUtils.checkGettable(parent), 
					GettableUtils.getStringGettable(index));
			return entryRef;
		} else {
			if(parent.type().isArray() || List.class.isAssignableFrom(parent.type())){
				ArrayElementRef elementRef = new ArrayElementRef (parent.qualifiedName(), 
						GettableUtils.checkGettable(parent), 
						GettableUtils.getDecimalGettable(index));
				return elementRef;
			} else {
				ElementRef elementRef = new ElementRef (parent.qualifiedName(), 
						GettableUtils.checkGettable(parent), 
						GettableUtils.checkGettable(index));
				return elementRef;
			}
		}
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
