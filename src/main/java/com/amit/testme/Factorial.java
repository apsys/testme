package com.amit.testme;

public class Factorial {
	
	public static void findFact(int n) {
		int sum=1;
		int i=n;
		int original = n;
		while(i>=1) {
			sum = sum*n;
			n = n-1;
			i--;
		}
		System.out.println("factorial of "+original+" is "+sum);	
	}

	public static void main(String[] args) {
		for (int i=0; i<=10; i++)
		findFact(i);
	}
}
