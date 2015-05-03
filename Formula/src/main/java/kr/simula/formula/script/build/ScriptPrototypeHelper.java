package kr.simula.formula.script.build;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import kr.simula.formula.core.Function;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Literal;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.builder.helper.PrototypeHelper;
import kr.simula.formula.core.factory.PrototypeFactory;
import kr.simula.formula.core.wrapper.LambdaFunction;
import kr.simula.formula.core.wrapper.RecordGettable;
import so.ontolog.data.record.Record;
import so.ontolog.data.record.RecordField;
import so.ontolog.data.record.RecordMetadata;

public class ScriptPrototypeHelper extends PrototypeHelper {
	private static Logger logger = Logger.getLogger(ScriptPrototypeHelper.class.getName());
	
	private static PrototypeFactory recordFactory = new PrototypeFactory() {
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public void protoField(BuildContext current, String token,
				List fieldList, Class<?> type, String name, Node defaultValue,
				Object... extra) {
			RecordField field = new RecordField(name, type);
			
			if(defaultValue instanceof Literal){
				field.setDefaultValue(((Literal) defaultValue).getValue());
			} else if(defaultValue instanceof Gettable){
				Gettable<?>gettable = (Gettable)defaultValue;
				Class<?> gettableType = gettable.type();
				
				if( gettableType.isArray() ){
					field.setDefaultValue(gettable.get(null));
				} else if( Record.class.isAssignableFrom(gettableType) ){
					field.setDefaultValue(gettable.get(null));
				} else if( Function.class.isAssignableFrom(gettableType) ){
					field.setDefaultValue(gettable.get(null));
				} else if( Map.class.isAssignableFrom(gettableType) ){
					field.setDefaultValue(gettable.get(null));
				} else {
					throw new BuildException("Record field default value '" + defaultValue + "' is not allowed.");
				}
			} else if(defaultValue instanceof LambdaFunction){
				field.setDefaultValue(defaultValue);
			}  else if(defaultValue !=null) {
				logger.warning("Unexpected record field type : " + defaultValue );
			}
			
			fieldList.add(field);
		}
		
		@SuppressWarnings({ "rawtypes", "unchecked", })
		@Override
		public Gettable<Record> createProto(BuildContext current, String token,
				List fieldList) {
			List<RecordField> kvList = (List<RecordField>)fieldList;
			RecordMetadata metadata = RecordMetadata.newMetadata("R" + kvList.hashCode(), kvList);
			
			Object[]values = new Object[kvList.size()];
			for(int i=0;i<values.length;i++){
				values[i] = kvList.get(i).getDefaultValue();
			}
			Record record = new Record(metadata, values);
			
			return new RecordGettable(record);
		}
	};
	
	@Override
	protected void initDefaults() {
		setFactory(GrammarTokens.RECORD, recordFactory);
		
	}
}
