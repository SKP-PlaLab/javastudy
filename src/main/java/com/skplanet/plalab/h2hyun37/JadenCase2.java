package com.skplanet.plalab.h2hyun37;

public class JadenCase2 {

	public static void main(String[] args) {
		
		JadenCase1 jc = new JadenCase1();
		String phrase1 = "How can mirrors be real if our eyes aren't real";
		System.out.println(jc.toJadenCase(phrase1));

		String phrase2 = null;
		System.out.println(jc.toJadenCase(phrase2));
		
		String phrase3 = "";
		System.out.println(jc.toJadenCase(phrase3));

	}

	public String toJadenCase(String phrase) {
	    
		
		// validate null string or empty("") string
	    if ((phrase == null) || ("".equals(phrase))) {
	      return null;
	    } 
	    
		char[] phraseCharArray = phrase.toCharArray();
		    
		for (int i = 0; i < phraseCharArray.length; i++) {
			
			char currentChar = phraseCharArray[i];			
			

			// Is an alphabet char
			if (Character.isAlphabetic(currentChar)) {
				
				// if current char is an alpahbet and first char , then replace to upper case
				if (i == 0) {
					phraseCharArray[i] = Character.toUpperCase(currentChar);
					
				} else {
					// replace to upper case if prev char is not an alphabet char
					char prevChar = phraseCharArray[i-1];
					if (!Character.isAlphabetic(prevChar)) {
						phraseCharArray[i] = Character.toUpperCase(currentChar);
					}
				}
			}
		}

		return String.valueOf(phraseCharArray);
	}

}
