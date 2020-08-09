package pranay.java;

public class TestPalin {

	/**
	 * @param args
	 * 
	 */
	
	public static void checkPalin(int[]a,int len){
	int j = len-1;
	boolean notPalin = false;
		for(int i =0;i<j;i++){
			if(a[i]==a[j]){
				j--;
			}
			else {
				notPalin=true;
				System.out.println("Not a Palindrome");
			}
		}
		if(!notPalin){
			System.out.println("Its a  Palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,3,2,1};
TestPalin.checkPalin(arr, arr.length);
	}

}
