package com.amit.testme;

public class ReverseNumber {


	public static void main(String[] args) {
		
		rev(143);
		rev(87320);
		rev(1424);
		
		
		
		public static void rev(int n) {
			int sum=0; int no=0;
			while(n>0) {
				no=n%10; //143%10=3, 14%10=4, 1
				n=n/10; //143/10=14, 14/10=1, 0
				sum = sum*10+no; //3, 3*10+4=34, 
			}
			System.out.println("reversed no: "+sum);
		}

	}

}
