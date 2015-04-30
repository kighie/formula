package kr.simula.formula.core.function.builtin;


public class Println implements BuiltInFunction<Void> {
	private static final long serialVersionUID = 8637835216466368696L;
	
	private final static Class<?>[] ARG_TYPES = new  Class<?>[]{Object.class};
	
	@Override
	public String getName() {
		return "println";
	}
	
	@Override
	public Class<? extends Void> getReturnType() {
		return Void.class;
	}
	
	@Override
	public Class<?>[] getArgTypes() {
		return ARG_TYPES;
	}
	
	@Override
	public Void eval(Object... args) {
		if(args.length <1){
			System.out.println("NULL");
		} else {
			System.out.println(args[0]);
		}
		
		return null;
	}

	
}
