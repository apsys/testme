package com.amit.testme;

import java.util.Scanner;

public class RanuStringRev {

	public static String ReverseString(String originalString, int start, int end) {
		
		String Reverse="";

		for(int i=end; i>=start; i--) {
			Reverse = Reverse+originalString.charAt(i);
		}
		return Reverse;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter String");
		String originalString = input.nextLine();
		int start=0;
		int end = originalString.length();
		int middle = (start+end)/2;
		if(end%2==0) 
			// mistake was done to see middle element as odd or even, but total length of the string is to be checked for even n odd
			System.out.println(ReverseString(originalString, start, middle-1) + ReverseString(originalString, middle, end-1));
		else
			System.out.println(ReverseString(originalString,start, middle-1)+originalString.charAt(middle)+ReverseString(originalString,middle+1, end-1));
	}
}
