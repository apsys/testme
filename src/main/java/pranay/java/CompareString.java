package pranay.java;

public class CompareString {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = new String("abc");
		//String s2 = new String();
		String s2 = new String("abc");
		String s3 = new String(s1);


		System.out.println(s1==s2);

		System.out.println(s2==s3);

		System.out.println(s1==s3);
		System.out.println(s2.equals(s3));

		// TODO Auto-generated method stub

	}

}
