package javaBrushup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListJava {

	public static void main(String[] args) {
		
		//Both of the below can be used ArrayList or List
		//ArrayList<String> a= new ArrayList<String>();
		List<String> a= new ArrayList<String>();
		a.add("Ram");
		a.add("Narayan");
		a.add("Shiv");
		a.add("Krisn");
		
		//for loop
		
		for(int i=0; i<a.size(); i++) 
		 { 
			System.out.println(a.get(i)); 
		 }
		 
		//Enhanced for loop
		for(String val: a)
		{
			System.out.println(val);
		}
		
		//item is presnt in the arraylist or not
		Boolean match = a.contains("Krisn");
		System.out.println(match);
		
		// to convert array into arraylist
		String[] name = {"Hanuman","Karna","Arjuna"};
		List<String> arrList = Arrays.asList(name);
		System.out.println(arrList);
		
		
	}

}
