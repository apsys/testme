package com.amit.testme;

public class GreatestOf3 {
	
	public static void findGreatest(int x, int y, int z) {
		int greatest = x; //6, 13, 8
		if (y>x && y>z)
			greatest = y;
		if (z>x && z>y)
			greatest =z;
		System.out.println("greatest: "+greatest);
	}

	public static void main(String[] args) {
		
		findGreatest(16, 13, 8);
		findGreatest(6, 13, 8);
		findGreatest(8, 13, 6);
		findGreatest(16, 3, 18);
		findGreatest(6, 13, 18);
		findGreatest(16, 3, 8);

	}
}
