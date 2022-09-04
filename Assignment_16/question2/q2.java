package Assignment_16.question2;

/* Q.2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map   */


import java.util.HashMap;
import java.util.Map;

public class q2 {

	public static void main(String[] args){


//Create a HashMap with at least 10 key value pairs of the Student ID and Name
//Insert a Key value mapping into the map
		HashMap<Integer, String> map = new HashMap<>();   // Hashmap <Student ID, Name>
		map.put(101, "Vivek Mali");
		map.put(102, "Shrushti ");
		map.put(103, "Abhishek ");
		map.put(104, "Mansi ");
		map.put(105, "Tushar ");
		map.put(106, "Vedant ");
		map.put(107, "Pratik ");
		map.put(108, "Rutwij ");
		map.put(109, "Vinod ");
		map.put(110, "Prvithraj ");
		System.out.println(map);

//Fetch the value of a Key
		System.out.println(map.get(102));

//Create a clone/copy of HashMap
		HashMap<Integer, String> clonemap = (HashMap<Integer, String>)map.clone();
		System.out.println("Cloned HashMap: " + clonemap);

//Check if the given Key is in the Map
		System.out.println("Is the key '20' present? " + map.containsKey(20));

//Check if the value is in the Map
		System.out.println("Is the value Pratik present? " + map.containsValue("Pratik "));

//Check if the map is empty
		System.out.println(map.isEmpty());

//Print the size of the Map to the console
		System.out.println(map.size());

//Print all the Keys of the map to the console
		System.out.println("\nKeys are: ");
		for (Integer key: map.keySet()) {
			System.out.println(key);
		}

//Print all the Values of the map to the console
		System.out.println("\nValues are: ");
		for (String value: map.values()) {
			System.out.println(value);
		}

//Remove a specific Key-value pair
		map.remove(105, "Tushar ");
		System.out.println(map);

//Copy all the elements of the Map to another Map
		Map<Integer, String> second_map = copyMap(map);
		System.out.println(second_map);

	}
	public static <Key, Value> Map<Key, Value> copyMap(Map<Key, Value> original) {
		return new HashMap<>(original);
	}
}
