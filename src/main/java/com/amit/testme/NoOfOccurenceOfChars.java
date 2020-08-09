package com.amit.testme;

public class NoOfOccurenceOfChars {

	public static void main(String[] args) {
		String str = "panchabhai";
	      System.out.println("Originals string is: " + str);
	      
	      char[] carray = str.toCharArray();

	      System.out.print("Duplicates are: ");
	      
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[i] + " ");
	               break;
	            }
	         }
	      }


	}

}
