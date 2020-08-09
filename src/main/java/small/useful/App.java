package small.useful;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        int i, j, k, l=0;
        k=l++;
        j=++k;
        i=j++;
        System.out.println(i);
        
        
        String s1 = "Hello";
        String s2 = new String(s1);
        String s3 = "HELLO";
        System.out.println(s1.equals(s2) + " "+s2.equals(s3) + " "+ (s1 == s2)+ " "+ (s2 ==s3));

    }
}
