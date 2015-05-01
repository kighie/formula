package kr.simula.formula.script.build;

import java.util.List;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.helper.PrototypeHelper;
import kr.simula.formula.core.factory.PrototypeFactory;
import kr.simula.formula.core.wrapper.RecordGettable;
import so.ontolog.data.record.Record;

public class ScriptPrototypeHelper extends PrototypeHelper {

	private static PrototypeFactory recordFactory = new PrototypeFactory() {
		
		@Override
		public void protoField(BuildContext current, String token,
				List<?> fieldList, Class<?> type, String name, Node defaultValue,
				Object... extra) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Gettable<Record> createProto(BuildContext current, String token,
				List<?> fieldList) {
			Record record = null;
			
			return new RecordGettable(record);
		}
	};
	
	@Override
	protected void initDefaults() {
		setFactory(GrammarTokens.RECORD, recordFactory);
		
	}
	
	public class RecordField {
		
	}
}
