package pranay.java;

public class TestFibo {

/**
 * @param args	 * @return 
 * @return 
	 * 
	 * 
	 */
	public static void checkFibo(int[] a, int len){
		int i=0;
		boolean flag = false;
		 while(i<len-2){
			 int sum = a[i]+a[i+1];
			 if(sum==a[i+2]){
				 i++;
				
			 }
			 else {
				 flag=true;
				 System.out.println("Its not a fibonacci series");
				 break;
			 }
			 }
		 if(!flag)
				System.out.println("Its a fibonacci series");
		 }
		 

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
    TestFibo.checkFibo(arr, arr.length);

	}

}
