package corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		//HashSet, TreeSet, LinkedHashSet implements Set interfaces
		//Set interfaces doesn't accept duplicate values like Lists
		//There is no guarantee that the elements are stored in sequential manner
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("AUSTRALIA");
		hs.add("SA");
		hs.add("INDIA");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		//hs.remove("UK");
		System.out.println(hs);
		System.out.println(hs.contains("USA"));

		Iterator<String> i = hs.iterator();
		//System.out.println(i.next());
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
