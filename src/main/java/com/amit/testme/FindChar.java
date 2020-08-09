package com.amit.testme;

public class FindChar {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ashvini";
		char ch = 'i';
		int count = 0;

			
			for (int i=0; i<str.length(); i++) {
				
				if(str.charAt(i) == ch) {
					count++;
				}
				
			}
			
			System.out.println("number of counts of "+ch+" is "+count);
		
		
		

	}

}
