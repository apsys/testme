package pranay.java;
class Iphone{
	
	public void m1(){
		System.out.println("just checking");
	}
	
	
}
public class Phone extends Iphone{

	int num = 5103429;
	/**
	 * @param args
	 * 
	 * 
	 */
	public Phone(){}
	
	public Phone(int n){
		num=n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phone p = new Phone();
Phone p1 = new Phone(111);
Iphone i = new Phone();

System.out.println("phone num is\t" +p.num);
System.out.println("phone num is\t" +p1.num);
i.m1();
	}

}
