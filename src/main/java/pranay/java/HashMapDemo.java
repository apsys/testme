package pranay.java;

import java.util.*;
class HashMapDemo {
public static void main(String args[]) {
// Create a hash map
TreeMap hm = new TreeMap();
// Put elements to the map
hm.put("A", new Double(3434.34));
hm.put("B", new Double(123.22));
hm.put("C", new Double(1378.00));
hm.put("D", new Double(99.22));
hm.put("E", new Double(19.08));
// Get a set of the entries
Set set = hm.entrySet();
// Get an iterator
Iterator i = set.iterator();
// Display elements
while(i.hasNext()) {
Map.Entry me = (Map.Entry)i.next();
System.out.print(me.getKey() + ": ");
System.out.println(me.getValue());
}
System.out.println();

}
}