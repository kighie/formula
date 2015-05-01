package kr.simula.formula.core.ref;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.wrapper.AbstractNode;

@SuppressWarnings("rawtypes")
public class FunctionRef extends AbstractNode implements Ref, Gettable<Function> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6215023078035182902L;
	protected final QName qname;
	protected final Function<?> function;
	
	public FunctionRef(QName qname, Function<?> function) {
		super();
		this.qname = qname;
		this.function = function;
	}
	
//	@Override
//	public ValueType valueType() {
//		return ValueType.FUNCTION;
//	}

	@Override
	public String getToken() {
		return GrammarTokens.REF;
	}
	
	@Override
	public Class<Function> type() {
		return Function.class;
	}
	
	@Override
	public Function<?> get(Context context) {
		return function;
	}
	
	@Override
	public String getExpression() {
		return qname.toString();
	}

	@Override
	public QName qualifiedName() {
		return qname;
	}
	
	@Override
	public String toString() {
		return "{fn-closure:" + getExpression() + "}";
	}

}
