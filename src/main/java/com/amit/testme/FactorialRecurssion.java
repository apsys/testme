package com.amit.testme;

public class FactorialRecurssion {
	
	public static int findFac(int n) {
		
		if(n<=1)
			return 1;
		else
			return n*findFac(n-1);
	}

	public static void main(String[] args) {

		for (int i=0; i<=10; i++)
		System.out.println("factorial of "+i+" is "+findFac(i));

	}
}
