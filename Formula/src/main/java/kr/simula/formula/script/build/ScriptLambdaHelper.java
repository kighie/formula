package kr.simula.formula.script.build;

import java.util.List;

import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Lambda;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.helper.LambdaHelper;
import kr.simula.formula.core.factory.LambdaFactory;
import kr.simula.formula.core.wrapper.LambdaFunction;

public class ScriptLambdaHelper extends LambdaHelper {

	static LambdaFactory lambdaFactory = new LambdaFactory() {

		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public Lambda create(BuildContext current, String token,
				List<Ref> args, Object... extra) {
			QName returnValueKey = new QName("RTN:" + hashCode());
			Class<?> retType = (extra != null && extra.length>0) ? (Class<?>)extra[0] : Void.TYPE;
			LambdaFunction<?> lambda = new LambdaFunction(retType, args, returnValueKey);
			return lambda;
		}
		
	};

	@Override
	protected void initDefaults() {
		super.initDefaults();
		setFactory(GrammarTokens.LAMBDA, lambdaFactory);
	}
}
