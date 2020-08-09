package pranay.java;


public class UniqueWordsQ7Demo {
	public static void main(String[] args)
	{
		String s = "I am a girl I am a girl in this world";
		String[] sArray;

		System.out.println("Entered string is - " + s);
		sArray = s.split(" ");
		
		for(int i=0; i<sArray.length; i++)
			System.out.print(sArray[i] + " ");
		
		System.out.println();
		System.out.println(sArray.length);
		
		System.out.println("Unique words in the string are: ");
		for(int j=0; j<sArray.length; j++)
		{
			String temp = sArray[j];
			int count = 0;
			for(int k=0; k<sArray.length; k++)
			{
				if(temp.equals(sArray[k]))
					count++;
			}
			
			if(count == 1)
			{
				System.out.print(temp + " ");
			}
		}
		
	}

}

