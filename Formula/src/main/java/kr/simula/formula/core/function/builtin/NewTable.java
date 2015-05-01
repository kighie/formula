package kr.simula.formula.core.function.builtin;

import so.ontolog.data.record.Record;
import so.ontolog.data.record.RecordMetadata;
import so.ontolog.data.table.Table;


public class NewTable implements BuiltInFunction<Table> {
	private static final long serialVersionUID = 8637835216466368696L;
	
	private final static Class<?>[] ARG_TYPES = new  Class<?>[]{Record.class};
	
	@Override
	public String getName() {
		return "newTable";
	}
	
	@Override
	public Class<? extends Table> getReturnType() {
		return Table.class;
	}
	
	@Override
	public Class<?>[] getArgTypes() {
		return ARG_TYPES;
	}
	
	@Override
	public Table eval(Object... args) {
		Record record = (Record)args[0];
		RecordMetadata meta = record.getMetadata();
		return new Table(meta);
	}

	
}
