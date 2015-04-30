package kr.simula.formula.core.function.builtin;

import kr.simula.formula.core.InternalException;


public class Assert implements BuiltInFunction<Void> {
	private static final long serialVersionUID = 8637835216466368696L;
	
	private final static Class<?>[] ARG_TYPES = new  Class<?>[]{Object.class, Object.class };
	
	@Override
	public String getName() {
		return "assert";
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
		if(args.length <2){
			throw new InternalException("assert (object,object,message)");
		} else if(args.length == 2) {
			if( !args[0].equals(args[1]) ){
				throw new InternalException("assert " + args[0] + " != " + args[1]);
			}
		} else if(args.length > 2) {
			if( !args[0].equals(args[1]) ){
				throw new InternalException("assert " + args[0] + " != " + args[1] + "; " + args[2]);
			}
		}
		
		return null;
	}

	
}
