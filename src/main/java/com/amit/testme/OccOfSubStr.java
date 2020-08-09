package com.amit.testme;

public class OccOfSubStr {
	
	
	public static void countOcc(String str, String findStr) {
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = str.indexOf(findStr,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += findStr.length();
		    }
		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";
		countOcc(str, findStr);

	}

}
