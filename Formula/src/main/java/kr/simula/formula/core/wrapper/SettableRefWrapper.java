/* 
 * Copyright (c) 2012 IkChan Kwon kighie@gmail.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kr.simula.formula.core.wrapper;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.Settable;
import kr.simula.formula.core.SourceLocation;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class SettableRefWrapper<T> implements Settable<T> {
	private Ref ref;
	
	/**
	 * @param type
	 * @param ref
	 */
	public SettableRefWrapper(Ref ref) {
		super();
		this.ref = ref;
	}

//	@Override
//	public ValueType valueType() {
//		return ValueTypeUtils.getValueType(ref.type());
//	}
	
	@Override
	public String getExpression() {
		return ref.getExpression();
	}

	@Override
	public String getToken() {
		return ref.getToken();
	}

	@Override
	public SourceLocation getLocation() {
		return ref.getLocation();
	}

	@Override
	public Settable<T> setLocation(SourceLocation location) {
		ref.setLocation(location);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Class<? extends T> type() {
		return (Class<? extends T>)ref.type();
	}

	@Override
	public void set(Context context, T value) {
		context.setReference(ref.qualifiedName(), value);
	}

}
