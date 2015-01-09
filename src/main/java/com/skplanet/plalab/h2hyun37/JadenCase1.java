package com.skplanet.plalab.h2hyun37;

public class JadenCase1 {

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
	    
		String[] phraseArray = phrase.split(" ");
		    
		for (int i = 0; i < phraseArray.length; i++) {
			
			char[] charArray = phraseArray[i].toCharArray();
		        
		    for (int j = 0; j < charArray.length; j++) {
		        	
		    	// substitute first character to upper case
		    	if (j == 0) {
		    		charArray[j] = Character.toUpperCase(charArray[j]);
		        } 
		    }
		        
		    // replace each word to capitalized word (ex> how -> How)
		    phraseArray[i] = new String(charArray);

		}
		    
		return String.join(" ", phraseArray);
	}

}
