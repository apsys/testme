package pranay.java;

public class BubbleSort {
// program to bubble sort 
	

	
	//method to sort the array
	// method with array and length of array
	public static void bubbleSort(int[] a, int l){
		int temp=0;
		for(int i=0;i<l;i++){
			for(int j =1;j<l-i;j++){
				if(a[j-1]>a[j]){
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
			
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {12, 9, 4, 99, 120, 1, 3, 10};
		
		//method call 
        bubbleSort(arr, arr.length);
        System.out.println("Values after sorting is ");
        for(int i =0;i<arr.length;i++){
        	System.out.print("\t "+arr[i]);
        }
	}

}
