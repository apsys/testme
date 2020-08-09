package com.amit.testme;

public class SwapNumbers {
	
	public static void swap(int x, int y) {
		
		System.out.println("before swap: x:"+x+" y:"+y);
		x=x+y; //x=2+5=7 y=7
		y=x-y; //y=7-5=2
		x=x-y; //x=7-2=5
		System.out.println("after  swap: x:"+x+" y:"+y);	
	}
	
	public static void swap2(int x, int y) {
		
		System.out.println("before swap: x:"+x+" y:"+y);
		//x=2 y=6
		x=x*y; //x=2*6=12, y=6
		y=x/y; //y=12/6=2, x=12
		x=x/y;
				
		System.out.println("after  swap: x:"+x+" y:"+y);
	}

	public static void main(String[] args) {
		
		swap(2, 5);
		swap2(12, 5);
	}
}
