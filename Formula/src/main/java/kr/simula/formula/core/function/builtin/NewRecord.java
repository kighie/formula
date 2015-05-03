package kr.simula.formula.core.function.builtin;

import so.ontolog.data.record.Record;


public class NewRecord implements BuiltInFunction<Record> {
	private static final long serialVersionUID = 8637835216466368696L;
	
	private final static Class<?>[] ARG_TYPES = new  Class<?>[]{Record.class};
	
	@Override
	public String getName() {
		return "newRecord";
	}
	
	@Override
	public Class<? extends Record> getReturnType() {
		return Record.class;
	}
	
	@Override
	public Class<?>[] getArgTypes() {
		return ARG_TYPES;
	}
	
	@Override
	public Record eval(Object... args) {
		Record record = (Record)args[0];
		return record.clone();
	}

	
}
