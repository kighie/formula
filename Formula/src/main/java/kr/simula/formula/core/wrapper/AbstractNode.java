package kr.simula.formula.core.wrapper;

import kr.simula.formula.core.Node;
import kr.simula.formula.core.SourceLocation;

public abstract class AbstractNode implements Node {
	
	protected SourceLocation location;
	
	
	@Override
	public Node setLocation(SourceLocation location) {
		this.location = location;
		return this;
	}

	@Override
	public SourceLocation getLocation() {
		return location;
	}

}
