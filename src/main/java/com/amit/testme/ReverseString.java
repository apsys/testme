package com.amit.testme;

class ReverseString { 
	
	public static void printRev(String s) {
		
		String original = s;
		String temp = "";
				
        char[] try1 = s.toCharArray();  
        for (int i = try1.length-1; i>=0; i--) {
            //System.out.print(try1[i]); 
            temp = temp + try1[i];
            System.out.println(temp);
        }
        if(original == temp)
        	System.out.println("Palindrome: "+original);
        else
        	System.out.println("Not Palindrome: "+original);
	}
	
    public static void printRev2(String s2) { 

        char[] temparray = s2.toCharArray(); 
        int left, right=0; 
        right = temparray.length-1; 
  
        for (left=0; left < right ; left++ ,right--) {  //IMP: update can have multiple statements
            // Swap values of left and right 
            char temp = temparray[left]; 
            temparray[left] = temparray[right]; 
            temparray[right]=temp; 
        } 
  
        for (char c : temparray) 
            System.out.print(c); 
        System.out.println(); 
    } 
    
    public static void thirdWay(String s) {
    	
    	char ch[] = s.toCharArray();
    	int i=0;
    	int j=s.length()-1;
    	while(i<j) {
    		if(ch[i] < ch[j]) {
    			char c = ch[i];
    			ch[i] = ch[j];
    			ch[j] = c;
    		}
    		i++;
    		j--;
    	}
    	for(char c: ch)
    		System.out.print(c);
    }
	
    public static void main(String[] args) { 
        String input = "Geeks For Geeks";        
        //printRev(input); 
        printRev("amit");
        printRev("nitin");
        /*
        System.out.println("\n\nUsing second method \n");
        printRev2(input);
        printRev2("amitpa");
        thirdWay("ranu");
        */
    } 
}