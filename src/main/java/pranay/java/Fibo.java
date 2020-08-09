package pranay.java;

public class Fibo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int limit = 10;
		
		long[] series = new long[limit];
		
		series[0]=0;
		series[1]=1;
		// create fibonacci series and put that in a array
		for(int i =2;i<limit;i++){
			series[i]= series[i-1]+series[i-2];
		
		}
		System.out.println("fibonacci series limit "+limit);	
		for(int i =0;i<limit;i++){
			System.out.println("The fibonacci series "+series[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
