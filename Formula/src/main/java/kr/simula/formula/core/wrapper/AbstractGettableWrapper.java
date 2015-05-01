package kr.simula.formula.core.wrapper;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.SourceLocation;

@SuppressWarnings("serial")
public abstract class AbstractGettableWrapper<T> implements Gettable<T> {

	protected final Gettable<?> original;
	
	
	public AbstractGettableWrapper(Gettable<?> original) {
		this.original = original;
	}

	@Override
	public String getToken() {
		return original.getToken();
	}

	@Override
	public SourceLocation getLocation() {
		return original.getLocation();
	}

	@Override
	public Gettable<T> setLocation(SourceLocation location) {
		original.setLocation(location);
		return this;
	}
}
