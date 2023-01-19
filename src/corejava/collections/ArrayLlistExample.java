package corejava.collections;

import java.util.ArrayList;

public class ArrayLlistExample {

	public static void main(String[] args) {

		//ArrayList, LinkedList, Vector can have duplicate values and implements interface
		//Array has fixed size where as ArrayList can grow dynamically
		//You can access and insert any value in any index in ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<String> strarr = new ArrayList<String>();
		strarr.add("Ram");
		strarr.add("Krsn");
		System.out.println(strarr);
		strarr.add(1, "Shiv");// adding based ont he index place
		//strarr.remove(0);
		//strarr.remove("Krsn");
		System.out.println(strarr);
		System.out.println(strarr.get(2));
		System.out.println(strarr.contains("Shiv"));
		System.out.println(strarr.indexOf("Shiv"));
		System.out.println(strarr.lastIndexOf("Shiv"));
		System.out.println(strarr.isEmpty());
		System.out.println(strarr.size());
		strarr.add("Ram");// Arraylist can have duplicate values
		System.out.println(strarr);

		
	}

}
