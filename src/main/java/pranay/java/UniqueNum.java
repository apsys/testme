package pranay.java;
import java.util.ArrayList;

public class UniqueNum {

	public static int[] uniNum(ArrayList<Integer> al) {

		int count = 0;
		int[] b = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			int duplicate = 1;
			for (int j = 1 + i; j < al.size(); j++) {

				if (al.get(i) == al.get(j)) {

					duplicate++;
					al.remove(j);

				} else {

					//
				}

			}
			System.out.println("the element " + al.get(i) + " occured "
					+ duplicate + "times");
			b[count] = al.get(i);
			count++;

		}

		return b;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(3);
		al.add(5);
		al.add(6);
		al.add(3);

		int[] result = UniqueNum.uniNum(al);
		System.out.println("Unique elements are as follows");
		for (int k : result) {
			System.out.println(k);
		}

	}

}
