package Assignment_16.question3;

/* Q.3. Create a HashSet with at least 10 elements of type String
        Write program covering all the operations of HashSet  */


import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class q3 {

	public static void main (String[] args) {


//Create a HashSet with at least 10 elements of type String
		HashSet<Integer> set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println(set);

//Write program covering all the operations of HashSet

		// Iterate through the Hashset by using Iterator object
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// add element in set
		System.out.println(set.add(5));

		// remove specific content
		set.remove(3);
		System.out.println("set after removing specific content: " + set);

		// adding 2 sets
		HashSet<Integer> set1 = new HashSet();
		set1.add(20);
		set1.add(21);
		set1.addAll(set);
		System.out.println(set1);

	    // remove all elements form set1
		set1.removeAll(set1);
		System.out.println(set1);

		// check if specific content present
		System.out.println(set.contains(4));

		// create clone of set
		HashSet cloned_set = new HashSet();
		cloned_set = (HashSet)set.clone();
		System.out.println("The clone set: " + cloned_set);

		// check if set is empty
		System.out.println(set.isEmpty());

		// check size of set
		System.out.println(set.size());

		// clear set
		set1.clear();
		System.out.println(set1);



	}
}
