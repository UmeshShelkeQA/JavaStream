package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetClasses {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>(4,0.25f);
		hs.add("umesh");
		hs.add("danish");
		hs.add("priya");
		hs.add("sneha");
		hs.add("madhuri");
		
		LinkedHashSet<String> lhs =new LinkedHashSet<>(4,0.25f);
		lhs.add("umesh");
		lhs.add("danish");
		lhs.add("priya");
		lhs.add("sneha");
		lhs.add("madhuri");
		System.out.println(lhs);
		
		
		TreeSet<Employee> ths =new TreeSet<>();
		ths.add(new Employee(1,"umesh",23000));
		ths.add(new Employee(2,"priya",47000));
		ths.add(new Employee(5,"danish",34000));
		ths.add(new Employee(3,"vikas",30000));
		System.out.println(ths);
		
		
		LinkedHashMap<String,String> hm = new LinkedHashMap<>(4,0.25f);
		hm.put("a","umesh");
		hm.put("b","danish");
		hm.put("c","priya");
		hm.put("d",null);
		hm.put("e",null);
		hm.put(null,"madhuri2");
		hm.put(null,"madhuri3");
		
		hm.forEach((a,b)->{System.out.println(a+"="+b);});
		hm.keySet();
		hm.values();
		hm.containsKey("");
		hm.containsValue("");
	}

}
