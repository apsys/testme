package com.amit.testme;

class ConverOpposite{ 
    
    // Method to convert characters  
    // of a string to opposite case 
    static void convertOpposite(StringBuffer str) { 
    	Character c;
    	for (int i=0; i< str.length(); i++) {
    		c = str.charAt(i);
    		if (Character.isLowerCase(c))
    			str.replace(i, i+1, Character.toUpperCase(c)+"");
    		if (Character.isUpperCase(c))
    			str.replace(i, i+1, Character.toLowerCase(c)+"");
    	}
    } 
      
    public static void main(String[] args)  { 
    	
        StringBuffer str = new StringBuffer("AmiTp"); 
        System.out.println("Before Conversion: "+str);
        // Calling the Method 
        convertOpposite(str);           
        System.out.println("After Conversion: "+str); 
        
       } 
} 