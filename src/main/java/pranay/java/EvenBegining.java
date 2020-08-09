package pranay.java;



public class EvenBegining {
    
        public static int[] sort(int[] a){  
            int count = 0;  
            int[] b = new int[a.length];  
            for(int i:a) {  
                if(i % 2 == 0) {  
                    b[count] = i; count++;  
                }  
            }  
            for(int i:a) {  
                if(i % 2 != 0) {  
                    b[count] = i; count++;  
                }  
            }  
            return b;  
        }  
      
        public static void main(String[] args) {  
            int [] a = {11 ,34 ,23 ,8,90,5};  
            int [] result = EvenBegining.sort(a);  
            for(int i:result){  
                System.out.println(i);}  
        }  
    }  

