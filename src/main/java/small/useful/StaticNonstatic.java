package small.useful;
public class StaticNonstatic {

    public static void main(String[] args) {

        new StaticNonstatic().nonStaticMethod();

    }



    public void nonStaticMethod() {
    	System.out.println("amit");
    }

}