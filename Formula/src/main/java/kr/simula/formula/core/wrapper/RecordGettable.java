package kr.simula.formula.core.wrapper;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import so.ontolog.data.record.Record;

public class RecordGettable extends AbstractNode implements Gettable<Record> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3622343404255371889L;
	private Record record;
	
	
	public RecordGettable(Record record) {
		super();
		this.record = record;
	}

	@Override
	public String getToken() {
		return GrammarTokens.RECORD;
	}

	@Override
	public Class<? extends Record> type() {
		return Record.class;
	}
	
	@Override
	public String getExpression() {
		return "record";
	}

	@Override
	public Record get(Context context) {
		return record;
	}

}
