package pranay.java;
import java.util.Scanner;


public class RecReverse {

	public static String reverse(String str){
		String temp = null;
		if (str.length()==0){
		return str;
		}
		else {
			
			String lastchar = str.substring((str.length()-1),(str.length()));
			String restchar = str.substring(0,str.length()-1);
			temp= lastchar+reverse(restchar);
			return temp;
			
		}
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the string array");
   String str = sc.next();
   String revstr = reverse(str);
   System.out.println(revstr);
	}

}
