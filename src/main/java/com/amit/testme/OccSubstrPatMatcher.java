package com.amit.testme;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccSubstrPatMatcher {

	public static void main(String[] args) {

		
		String str = "helloslkhellodjladfjhello";
		Pattern p = Pattern.compile("hello");
		Matcher m = p.matcher(str);
		int count = 0;
		while (m.find()){
		    count +=1;
		}
		System.out.println(count);  
		
		String searchPattern="Mi"; // search string
	    String mainStr="MitelMitel"; // whole string
	    int searchLength = searchPattern.length(); 
	    int mainStrLength = mainStr.length(); 
	    int k = 0;
	    for (int i = 0; i < mainStrLength - searchLength + 1; i++) {
	        String subStr = mainStr.substring(i, searchLength + i);
	        if (subStr.equals(searchPattern)) {
	           k++;
	        }

	    }
		System.out.println(searchPattern+" count is "+k+" in String "+mainStr); 

	}

}
