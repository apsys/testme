package pranay.java;
import java.util.Scanner;

public class UniqWords {

	public static  void uniWords(String s){
		String []sarr ;
		sarr = s.split(" ");
		
		System.out.println("Print the words you entered");
		 for(String word : sarr){
			 System.out.print(word+" " );
			 }
		 System.out.println("");
		 System.out.println("length of string is  "+sarr.length);
		 System.out.println("unique word are");
		 for(int i =0;i<sarr.length;i++){
			 
			 int count = 0;
			 String temp =  sarr[i];
			 for (int j=0;j<sarr.length;j++){
			
			 if(temp.equals(sarr[j])){
			
				 count++;
			 }
			 
			 }
			 if(count==1){
				 System.out.print(temp + " ");
			 }
		 }
		 }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string with some repeated words");
String str = sc.nextLine();
UniqWords.uniWords(str);

	}

}
