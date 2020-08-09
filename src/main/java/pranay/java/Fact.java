package pranay.java;

public class Fact {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int var =5;
    int temp=var;
    
    for (int i=var-1;i>0;i--){
    	temp=temp*i;
    }
    System.out.println("Factorial is "+temp);
	}

}
