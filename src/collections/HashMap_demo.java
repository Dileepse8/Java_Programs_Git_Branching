package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_demo {

	public static void main(String[] args) {
		
		//HashMap map=new HashMap();
		//Map map=new HashMap();
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "dileep1");
		map.put(102, "dileep2");
		map.put(103, "dileep2");
		map.put(104, "dileep3");
		map.put(101, "dileep4");
		map.put(105, "dileep5");
		System.out.println(map);//{101=dileep4, 102=dileep2, 103=dileep2, 104=dileep3, 105=dileep5}
		System.out.println(map.size());
		System.out.println(map.get(102));
		map.remove(101);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.keySet());
		for(Object k:map.keySet()) {
			
			System.out.println(k + " Value is " +map.get(k));
			System.out.println();
			
		}
		
	}
}
