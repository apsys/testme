package pranay.java;
import java.io.*;
public class Factrec {
	

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
System.out.println("Enter the number\r");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a = Integer.parseInt(br.readLine());
int result= fact(a);

System.out.println("the factorial of number is "+result);
	}
public static int fact(int b){
	if (b<=1)
		return 1;
	else
	return b*fact(b-1);
	
}
}
