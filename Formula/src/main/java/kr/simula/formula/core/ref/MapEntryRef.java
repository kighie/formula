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

import java.util.Map;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.wrapper.AbstractNode;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class MapEntryRef extends AbstractNode implements Ref, Gettable<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9218563634962128742L;
	private Class<?> type = Object.class;
	private Gettable<?> parent;
	private Gettable<String> indexer;
	private QName qname;
	
	/**
	 * @param parent
	 * @param indexer
	 */
	public MapEntryRef(QName pqname, Gettable<?> parent, Gettable<String> indexer) {
		super();
		this.parent = parent;
		this.indexer = indexer;
		this.qname = new QName(pqname, indexer.getExpression());
	}

	@Override
	public Class<?> type() {
		return type;
	}

	@Override
	public String getToken() {
		return GrammarTokens.ARRAY_EL;
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append(parent.getExpression()).append("[").append(indexer).append("]");
		return buf.toString();
	}

	public String getIndex(Context context){
		return indexer.get(context);
	}
	
	@SuppressWarnings({ "rawtypes" })
	@Override
	public Object get(Context context) {
		Object array = parent.get(context);
		String index = indexer.get(context);
		
		if(array == null){
			return null;
		}
		Object value = null;
		
		if(array instanceof Map){
			value = ((Map)array).get(index);
		} else {
			throw new EvalException(this, parent + " is not array.");
		}
		return value;
	}
	
	@Override
	public QName qualifiedName() {
		return qname;
	}

	public void setRequiredType(Class<?> requiredType) {
		this.type = requiredType;
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append(parent.toString()).append("[").append(indexer).append("]");
		return buf.toString();
	}
}
