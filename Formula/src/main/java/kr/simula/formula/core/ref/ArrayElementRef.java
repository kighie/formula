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
package kr.simula.formula.core.ref;

import java.util.List;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.wrapper.AbstractNode;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ArrayElementRef<T> extends AbstractNode implements Ref, Gettable<T> {
	private Class<T> type;
	private Gettable<?> parent;
	private Gettable<Number> indexer;
	private QName qname;
	
	/**
	 * @param parent
	 * @param indexer
	 */
	public ArrayElementRef(QName pqname, Gettable<?> parent, Gettable<Number> indexer) {
		super();
		this.parent = parent;
		this.indexer = indexer;
		this.qname = new QName(pqname, indexer.getExpression());
	}

	@Override
	public Class<? extends T> type() {
		return type;
	}

	@Override
	public String getToken() {
		return GrammarTokens.ARRAY_EL;
	}
	
//	@Override
//	public ValueType valueType() {
//		return ValueTypeUtils.getValueType(type);
//	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append(parent.getExpression()).append("[").append(indexer).append("]");
		return buf.toString();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public T get(Context context) {
		Object array = parent.get(context);
		Number index = indexer.get(context);
		
		if(array == null){
			return null;
		}
		T value = null;
		
		if(array instanceof List){
			value = (T)((List)array).get(index.intValue());
		} else if(array.getClass().isArray()){
			value = ((T[])array)[index.intValue()];
		} else {
			throw new EvalException(this, parent + " is not array.");
		}
		return value;
	}
	
	@Override
	public QName qualifiedName() {
		return qname;
	}

	public void setRequiredType(Class<T> requiredType) {
		if((this.type != null) && (requiredType.isAssignableFrom( this.type) )){
			throw new BuildException("Ambiguous Ref type:" + this.type + "<>" + requiredType );
		}
		this.type = requiredType;
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append(parent.toString()).append("[").append(indexer).append("]");
		return buf.toString();
	}
}
