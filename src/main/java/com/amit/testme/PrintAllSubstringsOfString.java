package com.amit.testme;

public class PrintAllSubstringsOfString {
	
	public static void printSub(String s) {
		char c[] = s.toCharArray();
		for (int i=0; i<s.length(); i++)
			for (int j=i+1; j<=s.length(); j++)
				System.out.println(s.substring(i, j));
			
	}

	public static void main(String[] args) {

		printSub("abcd");

	}

}
