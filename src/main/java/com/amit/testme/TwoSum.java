package com.amit.testme;

public class TwoSum {
	
	public static void printPairs(int a[], int target) {
		//arr[] ={1,5,7,-1,5}
		//target=6
		int sum =0; 
		 for (int i=0; i<a.length; i++) {
		    for (int j= i+1; j< a.length; j++) {
		       //sum =  + ;
		       if(a[i] == target - a[j])
		        System.out.println("numbers are: "+a[i]+" " +a[j]);
		  }
		}
	}
	
	public static void twoSum(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	            	System.out.println("numbers are: "+nums[i]+" " +nums[j]);
	            }
	        }
	    }
	    System.out.println("No two sum solution");
	}


	public static void main(String[] args) {
		
		int arr[] ={1,-5,7,-1,5};
		printPairs(arr, 6);
		twoSum(arr, 6);

	}

}
