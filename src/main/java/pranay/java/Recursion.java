package pranay.java;

public class Recursion {

	public static void multi(int n) {
		if(n<10000) {
			multi(n*10);
			System.out.println(" Value2  "+n);
		}
		System.out.println(" Value is  "+n);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    multi(10);
	}

}
