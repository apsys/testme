package pranay.java;
import java.util.Scanner;
// to rever the word of string

public class StrMan {
	
	public static void RevStr(String s){
		String[] sarr;
		sarr=s.split("\\s");
		String temp;
		for(int i=0;i<sarr.length;i++){
			temp = sarr[i];
			//System.out.println(temp.length());
		    for(int j=temp.length()-1;j>=0;j--){
		     
		    	System.out.print(temp.charAt(j));
		    	
		    }
		    System.out.print(" ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some string ");
		String str = sc.nextLine();
        System.out.println("You entered : "+str);
        StrMan.RevStr(str);
	}

}
