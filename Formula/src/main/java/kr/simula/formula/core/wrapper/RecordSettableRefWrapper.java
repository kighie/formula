package kr.simula.formula.core.wrapper;

import java.util.Map;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.Settable;
import kr.simula.formula.core.builder.BuildException;
import so.ontolog.data.record.Record;

@SuppressWarnings("rawtypes")
public class RecordSettableRefWrapper extends SettableRefWrapper<Map> {
	
	private static final long serialVersionUID = 5014969078954418716L;

	public RecordSettableRefWrapper(Ref ref) {
		super(ref);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected SettableRefWrapper.Setter<Map> createSetter(Ref ref) {
		if(!Record.class.isAssignableFrom(ref.type())){
			throw new BuildException(ref + " is not Record type.").setLocation(ref);
		}
		
		Setter<Map> setter;
		Gettable<Record> gettable;
		
		if (ref instanceof Gettable) {
			gettable = (Gettable<Record>)ref;
		} else {
			throw new BuildException("Record reference is not gettable.").setLocation(ref);
		}
		
		if(ref instanceof Settable){
			setter = new RecordSettableSetter(gettable, (Settable<Record>)ref);
		} else {
			setter = new RecordSetter(gettable, ref.qualifiedName());
		}
		
		
		return setter;
	}

	class RecordSettableSetter implements Setter<Map> {
		private Settable<Record> settable;
		private Gettable<Record> gettable;
		
		public RecordSettableSetter(Gettable<Record> gettable, Settable<Record> settable) {
			this.settable = settable;
			this.gettable = gettable;
		}

		@SuppressWarnings("unchecked")
		@Override
		public void set(Context context, Map value) {
			Record record = gettable.get(context);
			
			if(record == null){
				if(value instanceof Record){
					settable.set(context, (Record)value);
				}
				throw new EvalException(settable, "Cannot assign Map value to Record variable.");
			} else {
				record.putAll(value);
			}
		}
	}
	
	class RecordSetter implements Setter<Map> {
		private QName qname;
		private Gettable<Record> gettable;
		
		public RecordSetter(Gettable<Record> gettable, QName qname) {
			this.qname = qname;
		}

		@SuppressWarnings("unchecked")
		@Override
		public void set(Context context, Map value) {
			Record record = gettable.get(context);
			
			if(record == null){
				if(value instanceof Record){
					context.setReference(qname, value);
				}
				throw new EvalException("Cannot assign Map value to Record variable.");
			} else {
				record.putAll(value);
			}
		}
	}
}
