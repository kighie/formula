package kr.simula.formula.core.builder.helper;

import java.util.List;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.factory.PrototypeFactory;

public class PrototypeHelper extends AbstractHelper<PrototypeFactory>{

	public Gettable<?> createProto(BuildContext current, String token, List<?> fieldList) {
		return getFactory(token).createProto(current, token, fieldList);
	}

	public void protoField(BuildContext current, String token, List<?> fieldList, Class<?> type, String name, 
			Node defaultValue, Object ... extra) {
		getFactory(token).protoField(current, token, fieldList, type, name, defaultValue, extra);
	}
	
}
