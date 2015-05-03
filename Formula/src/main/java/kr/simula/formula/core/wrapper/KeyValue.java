package kr.simula.formula.core.wrapper;

import java.io.Serializable;

import kr.simula.formula.core.Gettable;

public class KeyValue<E> implements Serializable {
	private static final long serialVersionUID = -5610116688789854309L;

	protected final Class<? extends E> type;
	protected final String key;
	protected final Gettable<E> value;
	
	/**
	 * @param type
	 * @param key
	 * @param value
	 */
	public KeyValue(Class<? extends E> type, String key, Gettable<E> value) {
		super();
		this.type = type;
		this.key = key;
		this.value = value;
	}
	
	public Class<? extends E> type() {
		return type;
	}

	public String key() {
		return key;
	}

	public Gettable<E> value() {
		return value;
	}
	
	
}
