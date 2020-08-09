package pranay.java;

public class ReverseNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1234;
		int revnum =0;
		int temp =0;
		
		while (number>0){
			
			temp = number%10; // strip off the last digit
			revnum = revnum*10 + temp;
			number=number/10; // to get the first remaining numbers
			
		}

		System.out.println("Reversed number is "+revnum);
	}

}
