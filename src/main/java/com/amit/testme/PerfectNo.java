package com.amit.testme;

public class PerfectNo {
	
	//a perfect number is a positive integer that is equal to the sum of its positive divisors, 
	//excluding the number itself. For instance, 6 has divisors 1, 2 and 3 (excluding itself), 
	//and 1 + 2 + 3 = 6, so 6 is a perfect number.
	
	public static void findPerfNo(int n) {
		int no=0;
		for (int i=1; i<=n/2; i++) {
			if(n%i==0) {
				//System.out.println("i: "+i);
				no = no+i;
			}
		}
		if(no == n)
			System.out.println("perfect no: "+n);
	}

	public static void main(String[] args) {
		
		for(int i=1; i<10000; i++)
		
		findPerfNo(i);

	}
}
