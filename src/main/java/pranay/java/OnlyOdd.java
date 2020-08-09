package pranay.java;

public class OnlyOdd {

	/**
	 * @param args
	 * 
	 * 
	 */
	public static void printOdd(int[]a,int len){
		for(int i =0 ;i<len;i++){
			if(a[i]%2==0){
			System.out.print("");
			}
			else {
				System.out.print("\t"+a[i]);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      int [] arr = {0,1,2,3,4,5,6,7,8,9};
      printOdd(arr,arr.length);
	}

}
