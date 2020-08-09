package com.amit.testme;
import java.util.*;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {
	
	public static void firstWay(String str1) {
		
		for (int i = 0; i < str1.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str1.length(); j++) {
				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					unique = false;
					break;
				}
			}
			
			if (unique) {
				System.out.println("The first non repeated character in String is: " + str1.charAt(i));
				break;
			}
		}	
	}
	
	public static void secondWay(String str) {
		
		Map<Character,Integer> counts = new LinkedHashMap<>(str.length()); 
		for (char c : str.toCharArray()) { 
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1); 
			} 
		for (Entry<Character,Integer> entry : counts.entrySet()) { 
			if (entry.getValue() == 1) 
				System.out.println(entry.getKey());
		}
				
				
	} 

	public static void main(String[] args) {
		String str1 = "gibblegabbler";
		System.out.println("The given string is: " + str1);
		firstWay(str1);
		secondWay(str1);
	}
}
