package com.amit.testme;

public class VowelCheckerIteration {
	
	public static void findVowels(String str) {
		
	      String vowels = "aeiou";
	      System.out.print("Vowels in the string are: ");
	      
	      for (char character : str.toCharArray()) {
	    	  
	         if (vowels.indexOf(character) != -1) {
	            System.out.print(character + " ");
	         }	         
	      }
	      
	      //Printing all vowels and their position
	      char c[] = str.toCharArray();
	      for (int i=0; i<c.length; i++) {
	    	  
	    	  if(vowels.indexOf(c[i]) != -1)
	    		  System.out.println("\n character: "+c[i]+" position: "+i);	    	  
	      }		
	}
	
	   public static void main(String[] args) {
		   //https://codippa.com/how-to-print-vowels-in-a-string-in-java/
	      String str = "panchabhai";
	      findVowels(str);
	      findVowels("123");
	      
	      //indexOf Practice
	      /*String myStr = "Hello planet earth, you are a great planet.";
	      System.out.println("\n\n"+myStr.indexOf("p"));
	      System.out.println(myStr.indexOf("p", 7));
	      
	      String blahblah = "amit";
	      System.out.println("amit and a: "+blahblah.indexOf('t'));
	      
	      System.out.println("\n"+myStr.indexOf("planet"));
	      System.out.println(myStr.indexOf("planet", 7));*/
	   }
	}