package kr.simula.formula.core.factory;

import java.util.List;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.builder.BuildContext;

public interface PrototypeFactory {
	Gettable<?> createProto(BuildContext current, String token, List<?> fieldList);

	void protoField(BuildContext current, String token, List<?> fieldList, Class<?> type, String name, 
			Node defaultValue, Object ... extra);
}
