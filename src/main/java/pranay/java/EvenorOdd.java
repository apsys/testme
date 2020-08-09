package pranay.java;

public class EvenorOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		int max = num[0];
		for(int i= 0;i<num.length;i++){
			
			if(num[i]>max)
			max=num[i];
			
			
		/*	
			
			if ((num[i]%2)==0) {
				System.out.println("The number is even " + num[i]);
			
			}
			else {
				System.out.println("The number is odd  " + num[i]);
			}*/
		}
		System.out.println("largest "+max);

		
	}

}
