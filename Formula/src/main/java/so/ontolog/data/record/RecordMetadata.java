package so.ontolog.data.record;

import so.ontolog.data.common.FieldMap;
import so.ontolog.data.util.StringArraySet;

public class RecordMetadata extends FieldMap<RecordField>{
	private static final long serialVersionUID = 5299769118204358961L;

	private final String name;

	
	public RecordMetadata(String name, String[] strArray) {
		this(name, strArray, new RecordField[strArray.length]);
	}


	public RecordMetadata(String name, String[] strArray, RecordField[] fields) {
		super(strArray, fields);
		this.name = name;
	}


	public RecordMetadata(String name, StringArraySet keySet, RecordField[] fields) {
		super(keySet, fields);
		this.name = name;
	}


	public String getName() {
		return name;
	}

}
