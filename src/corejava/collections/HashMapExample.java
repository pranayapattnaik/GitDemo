package corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		//This interface takes the values in form for key value pair
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "USA");
		hm.put(0, "UK");
		hm.put(42, "SA");
		hm.put(3, "INDIA");
		hm.put(7, null);
		System.out.println(hm);
		System.out.println(hm.get(42));
		hm.remove(1);
		System.out.println(hm);
		
		Set es = hm.entrySet();
		Iterator it = es.iterator();
		while(it.hasNext())
		{
			Map.Entry mp = (Entry) it.next();// Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
