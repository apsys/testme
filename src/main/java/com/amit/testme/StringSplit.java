package com.amit.testme;

public class StringSplit {

	public static void main(String[] args) {

		String s1 = "ashvini panchabhai";
		String[] strArr = s1.split(" ");
		String s2 = "ashvini";
		int l = s2.length()/2;
		System.out.println("length of s2: "+l);
		System.out.println("String array size: "+strArr.length);
		
		for(String x: strArr)
			System.out.println("Element in String array: "+x);
		

	}

}
