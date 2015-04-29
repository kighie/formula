package kr.simula.formula.core.function.builtin;

public class Println extends AbstractBuiltinFunction<Void> {
	private static final long serialVersionUID = 8637835216466368696L;

	@Override
	public Class<? extends Void> getReturnType() {
		return Void.class;
	}
	
}
