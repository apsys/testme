package com.amit.testme;

class SelectionSort { 
	
	public static void selectionSort(int[] arr) {  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int min = i;  
            for (int j = i + 1; j < arr.length; j++) {  
                if (arr[j] < arr[min]) {  
                	
                    min = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[min];   
            arr[min] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]) {  
        int[] arr1 = {9,14,3,2,43,11,58,22};
        
        System.out.println("Before Selection Sort");  
        for(int i: arr1) {  
        	
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("\nAfter Selection Sort");  
        for(int i:arr1) {  
        	
            System.out.print(i+" ");  
        }  
    }  
} 