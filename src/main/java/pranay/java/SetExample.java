package pranay.java;
import java.util.*;
public class SetExample {
public static void main(String args[]) {
Set set = new HashSet();
set.add("Behara");
set.add("Eswar");
set.add("Ganaesh");
set.add("Eswar");
set.add("Charan");
System.out.println(set);
Set sortedSet = new TreeSet(set);
System.out.println(sortedSet);
}
}