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
package kr.simula.formula.core.builder.helper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.util.RefUtils;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class TypeHelper {

	protected final HashMap<String, Class<?>> typeMap = new HashMap<String, Class<?>>();
	
	public static final String NUMBER = "number";
	public static final String TEXT = "text";
	public static final String BOOLEAN = "boolean";
	public static final String DATE = "date";
	public static final String OBJECT = "object";
	public static final String VOID = "void";
	public static final String System = "System";
	public static final String MAP = "map";
	
	/**
	 * 
	 */
	public TypeHelper() {
		initDefaults();
	}

	protected void initDefaults() {
		registerType(NUMBER, BigDecimal.class);
		registerType(TEXT, String.class);
		registerType(BOOLEAN, Boolean.class);
		registerType(DATE, Date.class);
		registerType(OBJECT, Object.class);
		registerType(VOID, Void.class);
		registerType(System, System.class);
		registerType(MAP, Map.class);

		registerType("BigDecimal", BigDecimal.class);
		registerType("String", String.class);
		registerType("Boolean", Boolean.class);
		registerType("Date", Date.class);
		registerType("Object", Object.class);
		registerType("Map", Map.class);

		registerType("int", BigDecimal.class);
		registerType("Integer", BigDecimal.class);
		registerType("long", BigDecimal.class);
		registerType("Long", BigDecimal.class);
		registerType("double", BigDecimal.class);
		registerType("Double", BigDecimal.class);
		registerType("float", BigDecimal.class);
		registerType("Float", BigDecimal.class);
	}
	
	public void registerType(String typeQname, Class<?> type){
		typeMap.put(typeQname, type);
	}
	
	
	public Class<?> getType(BuildContext context, String typeQname) {
		Class<?> type = typeMap.get(typeQname);
		if(type == null){
			type = RefUtils.toClass(typeQname);
		}
		if(type == null){
			throw new BuildException("TypeFactory for " + typeQname + " is not registered.");
		}
		return type;
	}
}
