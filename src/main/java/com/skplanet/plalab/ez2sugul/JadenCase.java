package com.skplanet.plalab.ez2sugul;

public class JadenCase {
	public String toJadenCase(String phrase) {
		
		char[] characters = phrase.toCharArray();
		boolean isJadenCase = true;
		
		if (phrase == null || phrase.length() <= 0) {
			return null;
		}
		
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] == ' ') {
				isJadenCase = true;
				continue;
			}
			
			if (((int)characters[i] < 97 || (int)characters[i] > 122)) {
				continue;
			}
			
			
			
			if (isJadenCase) {
				characters[i] = (char) (characters[i] - 32);
				isJadenCase = false;
			}
		}
		
		return new String(characters);
	}

}
