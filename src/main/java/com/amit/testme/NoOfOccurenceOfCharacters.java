package com.amit.testme;

class NoOfOccurenceOfCharacters {
	
	static final int MAX_CHAR = 256; 

	public static void main(String[] args) 
	{ 
 
		String str = "ashvini"; ; 
		
		// Create an array of size 256 i.e. ASCII_SIZE 
		int count[] = new int[MAX_CHAR]; 
		
		//System.out.println("count[0]: "+count[0]+" count array size: "+count.length);
		int len = str.length(); 

		// Initialize count array index 
		for (int i = 0; i < len; i++) 
			count[str.charAt(i)]++; 
		
		//System.out.println("count[1]: "+count[1]+" count array size: "+count.length);

		// Create an array of given String size 
		char ch[] = new char[len]; 
		for (int i = 0; i < len; i++) { 
			ch[i] = str.charAt(i); 
			int find = 0; 
			for (int j = 0; j <= i; j++) { 

				// If any matches found 
				if (str.charAt(i) == ch[j]) 
					find++;				 
			} 

			if (find == 1) 
				System.out.println("Number of Occurrence of " + 
				str.charAt(i) + " is:" + count[str.charAt(i)]);			 
		} 
	} 
} 
