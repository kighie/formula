package kr.simula.formula.core.wrapper;

import java.util.List;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.InternalException;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.util.GettableUtils;

public class BuiltInFunctionSpi<O> implements Function<O>, FunctionSpi<O> {
	
	private static final long serialVersionUID = 1L;

	private final Function<O> function;

	private final List<Ref> args;
	
	
	public BuiltInFunctionSpi(Function<O> function, List<Ref> args) {
		this.function = function;
		this.args = args;
	}

	

	@Override
	public Class<? extends O> getReturnType() {
		return function.getReturnType();
	}

	public Function<O> getFunction() {
		return function;
	}

	@Override
	public List<Ref> getArgs() {
		return args;
	}
	
	@Override
	public O eval(Object... args) {
		throw new InternalException("ClosureFunctionSpi#eval(Object[]) is not applicable.");
	}

	@Override
	public O evalFunc(Context context) {
		Object[] argArr = new Object[args.size()];
		Gettable<?> gettable;
		
		int i = 0;
		for(Node n : args){
			gettable = GettableUtils.checkGettable(n);
			argArr[i++] = gettable.get(context);
		}
		return function.eval(argArr);
	}
}
