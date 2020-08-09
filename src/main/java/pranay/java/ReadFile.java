package pranay.java;
import java.io.*;
import java.util.*;


public class ReadFile {
	
	public static void readFile(File fin) throws IOException{
		ArrayList<String> al= new ArrayList<String>();
		FileInputStream fstream = new FileInputStream(fin);
		  // Get the object of DataInputStream
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
		  //Read File Line By Line
		  while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
		  System.out.println (strLine);
		  al.add(strLine);
		  }
		  //Close the input stream
		  in.close(); 
		
		writeFile(al);
		
		
	       }
	public static void writeFile(ArrayList<String> s) throws IOException{
		
		  FileWriter fstream = new FileWriter("C:\\Documents and Settings\\monu\\Desktop\\worksp\\ReadFile\\java1.txt");
		  BufferedWriter out = new BufferedWriter(fstream);
		
		  for(int i =s.size()-1;i>0;i--){
		  
		  out.write(s.get(i));
		  out.write("\r\n");
		  }
		  //Close the output stream
		  out.close();
		
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// reading from file
		File filein = new File("C:\\Documents and Settings\\monu\\Desktop\\worksp\\ReadFile\\java.txt");
        ReadFile.readFile(filein);
      
      
	
	
       }

}
