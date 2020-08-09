package com.amit.testme;

public class Armstrong {
	
	//371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
	
	public static void findArmstrong(int n) {
		int original = n;
		int sum = 0, r = 0;
		
		//System.out.println();
		
		while (n > 0) {
			r = n%10;
			n /= 10;
			sum += r*r*r;			
		}
		if(sum == original)
			System.out.println("armstrong: "+original);
		else
			System.out.println("not armstrong: "+original);		
	}
	
	public static void findArmstrong(int num, int number) {
		
		int temp = 0, total = 0;
		
		for( ;number!=0; number /= 10){
		    temp = number % 10;
		    total = total + temp*temp*temp;
		}
        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");  	
	}
	
	public static void main(String[] args) {
		
		findArmstrong(153);
		findArmstrong(1254);
		findArmstrong(371);
		
		findArmstrong(120);
		findArmstrong(1634);
		//for(int i=1; i<1000; i++)
		//	findArmstrong(i);
		
		//overloading
		findArmstrong(153, 153);
		findArmstrong(1254, 1254);
		findArmstrong(370, 370);

	}

}
