package kr.simula.formula.core.wrapper;

import java.util.List;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Function;
import kr.simula.formula.core.Ref;

public interface FunctionSpi<O> extends Function<O> {

	/**
	 * may not implemented.
	 */
	O eval(Object ... args);
	

	/**
	 * @return the args
	 */
	List<Ref> getArgs();
	
	O evalFunc(Context context);
}
