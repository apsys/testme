package com.amit.testme;

public class VowelsConsonantsOthers {
	
	public static void findVCO(String str) {
		
		int countVow = 0; 
		int countConso = 0;
		int countOther = 0;
		
		String vowels = "aeiou";
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				if (vowels.indexOf(str.charAt(i)) != -1)
					countVow++;
				countConso++;
			}
			else 
				countOther++;
		}
		System.out.println("countVow: "+countVow+" countConso: "+countConso+" countOther: "+countOther);
	}

	public static void main(String[] args) {
		findVCO("amit:panchabha!");
		/*
		char ch = 'A';
		char chend = 'Z';
		for (int i=0; i<chend; i++) {
			System.out.println(ch);
			System.out.println("  "+(int)ch);
			ch++;
		}
	*/	
		System.out.println("Ranu's coding round");
		String s = "My name is granar";
		s = s.replaceAll("\\s", ""); 
		System.out.println("after trimming: "+s);
		String t = "a";
		int firstPosition = s.indexOf(t);
		int secondPosition = s.indexOf(t, firstPosition+1);
		System.out.println("first index: "+firstPosition);
		System.out.println("second index: "+secondPosition);
		int total = secondPosition-firstPosition;
		System.out.println("total length: "+total);
	}

}
