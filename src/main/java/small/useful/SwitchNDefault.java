package small.useful;

public class SwitchNDefault { 


	public static void main(String argv[]){ 

		int anar[]=new int[]{1,2,3}; 
		System.out.println(anar[1]); 

		int i=9; 
		switch (i) { 
		default: System.out.println("default"); 
		case 0: System.out.println("zero"); 
		break; 
		case 1: System.out.println("one"); 
		case 2: System.out.println("two"); 
		}

	} 
}