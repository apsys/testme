package com.amit.testme;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDups {
	
	public static void findDups(String str) {
		char c[]= str.toCharArray();
		
		//Set is not a class, it is an interface. 
		//It can  instantiate only class implementing Set (HashSet, LinkedHashSet orTreeSet)
		
		Set<Character> s = new LinkedHashSet<Character>();
		for (char ch: c) {
			s.add(ch);
		}
		System.out.println("Set has: "+s.toString());
		
		StringBuilder sb = new StringBuilder(s.size());
		for (Character character : s) {
		    sb.append(character);
		}
		System.out.println("after using String Builder: "+sb);
	}
	
	public static void secondWay(String str){
	    String result = "";
	    for (int i = 0; i < str.length(); i++) {
	        if(!result.contains(String.valueOf(str.charAt(i)))) {
	            result += String.valueOf(str.charAt(i));
	        }
	    }
	    System.out.println("\nSecond way: "+result);
	}
	
	public static void thirdWay(String s) {
		Set<Character> set=new LinkedHashSet<Character>();
		for(char c: s.toCharArray()) {
		    set.add(Character.valueOf(c));
		}
		System.out.println("\nThird way - Set has: "+set.toString());
	}

	public static void main(String[] args) {
		
		String original = "geeksforgeeks";
		System.out.println("original: "+original);

		findDups(original);
		secondWay(original);
		thirdWay(original);
	}

}
