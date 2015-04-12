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
package kr.simula.formula.core.util;

import kr.simula.formula.core.SourceLocation;

import org.antlr.v4.runtime.Token;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class SourceLocationUtils {
	
	public static SourceLocation createSourceLocation(Token token){
		BaseSourceLocation loc = new BaseSourceLocation(token.getLine(), token.getCharPositionInLine(), 
				token.getStartIndex(), token.getStopIndex());
		return loc;
	}

	public static SourceLocation createSourceLocation(int line, int charPositionInLine, 
			int startIndex, int endIndex){
		BaseSourceLocation loc = new BaseSourceLocation(line, charPositionInLine, startIndex, endIndex);
		return loc;
	}

	public static SourceLocation createSourceLocation(int line, int charPositionInLine){
		BaseSourceLocation loc = new BaseSourceLocation(line, charPositionInLine);
		return loc;
	}
	
}
