package pranay.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Arrdelete {

	static void del(int a[],int l,int p){
		@SuppressWarnings("unused")
		int item=a[p];
		for(int i = p;i<l;i++){
			a[i]=a[i+1];
		}
	
		
		
	}
	public static void main(String[] args) throws NumberFormatException,IOException{
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the length of array\n");
		
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = sc.nextInt();
		System.out.println("Enter elements of array\n");
		for(int i =0;i<len;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the position you want to delete from\n");
		int pos = sc.nextInt();
		 del(arr,len,pos);
			len =len-1;
		for(int i =0;i<len;i++){
		System.out.println("array is "+arr[i]);
		}

	}

}
