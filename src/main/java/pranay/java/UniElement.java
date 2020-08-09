package pranay.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class UniElement {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		//HashMap<Integer,String> hm = new HashMap<Integer,String>();
		Set<String> set = new HashSet<String>();
		File file = new File("testfile.txt");
        Scanner sc = new Scanner(file);
        int count =0;
        while(sc.hasNextLine()){
        
        	String str = sc.nextLine();
        	//System.out.println(str);
        	
        	String[] input = str.split(" ");
        	for(String val : input){
        		int k= count++;
        		Integer valCount = hm.get(val);
        		if (valCount == null){
        			valCount = 0;
        		}
        		valCount++;
        		hm.put(val,valCount);
        	   	//set.addAll(hm.values());
        	}
        	
        	
        }
        /*Collections.sort(hm.entrySet().t, 
        		new Comparator<Map.Entry<String, Integer>>(){
        			public int compare(Map.Entry<String, Integer> one, Map.Entry<String, Integer> two) {
        				return one.getValue() - two.getValue();
        			}
        			
        			public boolean equals(Object o){
        				return false;
        			}*/
        		

        System.out.println(hm);
      
     System.out.println(count);
	}

}
