package com.amit.testme;

import java.util.Arrays;

public class Anagram {
	
	public static void findAnagram(String s1, String s2) {
		boolean b = true;
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(c1.length != c2.length) {
			System.out.println("length not equal not anagram");
			b = false;
		}
		else
			for (int i=0; i<c1.length; i++) {
				if (c1[i] != c2[i]) {
					b = false;
					System.out.println("length equal but not anagram");
					break;
				}
			}
		if(b)
			System.out.println("anagram");			
	}
	
	public static void main(String[] args) {
		
		// LISTEN = SILENT
		// TRIANGLE = INTEGRAL
		
		findAnagram("LISTEN", "SILENT");
		findAnagram("LISTEN", "SILEN");
		findAnagram("LISTEN", "SIIENT");
	}

}
