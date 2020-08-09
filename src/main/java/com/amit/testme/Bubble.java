package com.amit.testme;

public class Bubble {

	public static void main(String[] args) {
		
		int a[] = { 12, 5, 65, 77, 22, 87, 45, 4, 37};
		int n = a.length;
		 
		for( int i=0; i<n-1; i++) {	
			for (int j=0; j<n-i-1;  j++) {		
				if(a[j] > a[j+1]) {
					//swapping elements
					int temp;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		//print the sorted elements	
		for (int x=0; x<n; x++) {
			System.out.println(a[x]);
		}
	}
}
