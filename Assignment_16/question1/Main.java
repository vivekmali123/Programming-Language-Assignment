package Assignment_16.question1;

                              //16. Collections

/* Q.1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList   */


import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

//Create an ArrayList of type String with 10 string elements.
        ArrayList<Integer> list = new ArrayList<Integer>();

//Add 10 string elements to ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

//Add an element to the ArrayList
        list.add(110);

//Iterate through the ArrayList by using Iterator object
        Iterator i = list.iterator();
        System.out.println("The ArrayList elements are:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

//Add an element at a specific index
        list.add(7,200);
        System.out.println(list);

//Remove an element from the ArrayList, Remove at an index
        list.remove(3);
        System.out.println(list);

//Update the element at a specific index
        list.set(2,300);
        System.out.println(list);

//Check the element is present at a particular index
        System.out.println(list.get(9));

//Get an element at a particular index
        System.out.println(list.get(5));

//Find out the size of the ArrayList
        System.out.println(list.size());

//Check the given element is present in the ArrayList
        System.out.println(list.contains(200));

//Remove all elements of the ArrayList
        list.removeAll(list);
        System.out.println(list);


    }
}
