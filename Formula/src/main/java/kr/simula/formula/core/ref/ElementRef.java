package kr.simula.formula.core.ref;

import java.util.List;
import java.util.Map;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.wrapper.AbstractNode;
import so.ontolog.data.common.Undefined;

/**
 * <pre>Map, Array, List element Ref </pre>
 * @author kighie@gmail.com
 *
 */
public class ElementRef extends AbstractNode implements Ref, Gettable<Object>, TypeLateBinding<Object> {
	
	private static final long serialVersionUID = 6619645933552739950L;
	
	private Class<?> type = Undefined.class;
	private Gettable<?> parent;
	private Gettable<?> indexer;
	private QName qname;

	public ElementRef(QName pqname, Gettable<?> parent, Gettable<?> indexer) {
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
	
	public Object getIndex(Context context){
		return indexer.get(context);
	}
	
	
	@SuppressWarnings({ "rawtypes" })
	@Override
	public Object get(Context context) {
		Object parentValue = parent.get(context);

		if(parentValue == null){
			return null;
		}
		
		Object value;
		
		if(parentValue instanceof Map){
			value = ((Map)parentValue).get(indexer.get(context));
		} else {
			Number index = (Number)indexer.get(context);
			if(parentValue instanceof List){
				value = ((List)parentValue).get(index.intValue());
			} else if(parentValue.getClass().isArray()){
				value = ((Object[])parentValue)[index.intValue()];
			} else {
				throw new EvalException(this, parent + " is not array nor List nor Map.");
			}
		}
		
		
		return value;
	}
	
	@Override
	public QName qualifiedName() {
		return qname;
	}

	@Override
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
