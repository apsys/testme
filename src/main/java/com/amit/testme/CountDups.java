package com.amit.testme;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountDups {

	public static void findDups(String s) {
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for(int i=0 ; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}		
		}

		for (Character key: hm.keySet()) {
			System.out.println("key : " + key);
			System.out.println("value : " + hm.get(key));
		}

		//program to find first non repeating key
		for(Character key: hm.keySet())
			if(hm.get(key)==2) {
				System.out.println("first non repeating key: "+key);
				break;
			}
	}

	private static void findDuplicatesUsingHashMap(int[] inputArray) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i=0; i<inputArray.length; i++) {
			int x = inputArray[i];
			if(hm.containsKey(x))
				hm.put(x, hm.get(x)+1);
			else
				hm.put(x, 1);
		}

		for (int a: hm.keySet()) {
			System.out.println("integerr key: "+a);
			System.out.println("integer value: "+hm.get(a));
		}
	}

	private static void findDuplicatesUsingHashSet(int[] inputArray) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int element : inputArray) {
			if( ! set.add(element)) 
				System.out.println("Duplicate Element : "+element);
		}
	}

	public static void main(String[] args) {

		findDups("panchabhai");
		findDups("gibblegabbler");
		int a[] = {3, 5, 2, 8, 3, 7, 1};
		findDuplicatesUsingHashMap(a);
		findDuplicatesUsingHashSet(a);
	}
}
