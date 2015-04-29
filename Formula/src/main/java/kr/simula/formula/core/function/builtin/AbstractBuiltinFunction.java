package kr.simula.formula.core.function.builtin;

import java.util.List;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.wrapper.FunctionSpi;

public abstract class AbstractBuiltinFunction<O> implements FunctionSpi<O>{

	private static final long serialVersionUID = 1L;

	@Override
	public O eval(Object... args) {
		throw new EvalException("BuiltinFunction#eval(Object[]) is not applicable.");
	}

	@Override
	public List<Ref> getArgs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public O evalFunc(Context context) {
		// TODO Auto-generated method stub
		return null;
	}

}
