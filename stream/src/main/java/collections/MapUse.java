package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		String str="Umesh Suresh Shelke";

//		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map = new LinkedHashMap<>();
//		Map<Character, Integer> map = new Hashtable<>();
		//count the all character occurence in the string
		for(char c:str.toCharArray()) {
			if(map.containsKey(c) ) {
				int cnt = map.get(c);
				map.put(c, cnt+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		System.out.println("-------------Traversing Using Map.Entry<> with ForLoop-----------------");
		
		Set<Entry<Character, Integer>> entryset = map.entrySet();
		
		for(Entry<Character, Integer> entry:entryset) {
			System.out.println(entry.getKey()+ " = "+entry.getValue());
		}
		System.out.println("-------------Traversing Using Map.Entry<> Using Iterator-----------------");
		Iterator<Entry<Character,Integer>> itr= entryset.iterator();
		while(itr.hasNext()) {
			Entry<Character,Integer> entry = itr.next();
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		System.out.println("-------------Traversing Using keySet-----------------");
		Set<Character> keys = map.keySet();
		for(Character c:keys) {
			System.out.println(c + " = "+map.get(c));
		}
		System.out.println("-------------getting value list-----------------");
		Collection<Integer> values = map.values();
		for(Integer c:values) {
			System.out.println(c);
		}
		System.out.println("-------------consuming using forEach loop which accept BiConsumer Reference-----------------");
		map.forEach((c,i)->System.out.println(c + "="+i));
		
	}

}
