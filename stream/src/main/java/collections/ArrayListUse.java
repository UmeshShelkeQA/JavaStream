package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ArrayListUse {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		List<Integer> l = new CopyOnWriteArrayList<>();
		al.add(10);
		al.add(1);
		al.add(2);
		al.add(12);
		al.add(11);
		al.add(17);
		
		System.out.println(al);
		//consumer interface --> public void accept(T t);
		
		al.forEach((element)-> { element+=1;} ); //only for interation purphose
		//removing all odd numbers from list using predicate interface reference
		System.out.println("Applying filter on ArrayList using Predicate Interface boolean test()");
		al.removeIf((t)-> { return t%2!=0; }); //using lambda for predicate interface, removeIf accepting Predicate Object Reference used to apply filter on collection  
		
		System.out.println(al);
		al.add(4);
		al.add(19);
		al.add(12);
		System.out.println(al);
		al.add(1, 20);
		System.out.println(al);
//		al.add(19,1);  //     -->IndexOutOfBoundException
//		System.out.println(al);
		
		//searching element in array
		System.out.println(al);
		System.out.println("Searching 13");
		if(al.contains(12)) {
			System.out.println("ArrayList Contain Element 12");
		}

		
		System.out.println(al);
		
		System.out.println("Searching 23");
		if (al.contains(23))
			System.out.println("Array Contains 13");
		else
			System.out.println("ArrayList Not Contains 23");
		
		//removing element fromarray
		System.out.println(al);
		System.out.println("Removing 12 from the List And Then Element at '2' pos");
		al.remove((Integer)12); //by default it is consider index as argument
		System.out.println(al);
		//by default it is consider index as argument 
		//al.remove(int index) --> return Element & Remove From ArrayList
		//al.remove(Object) --> return boolean & Remove From ArrayList
		System.out.println(al.remove(2)+""+ al);
		System.out.println("Using Remove All with Arrays.asList(20,11,12)");
		al.removeAll(Arrays.asList(20,11,12));
		System.out.println(al);
		
		//setting/updating value at
		System.out.println("Updating Value At 0 position");
		al.set(0, 99);
		System.out.println(al);
		
		System.out.println("Sorting In Ascending Order");
		al.sort(Comparator.naturalOrder());
		System.out.println(al);
		
		System.out.println("Sorting In Descending Order");
		al.sort(Comparator.reverseOrder());
		System.out.println(al);
		//shuffle method
				
		Collections.shuffle(al);
		System.out.println("Shuffled ArrayList");
		System.out.println(al);
		
		//checking is empty or Not
		System.out.println("Checking List is empty or not");
		if (al.isEmpty()) {
			System.out.println("   Yes It is Empty");
		}else {
			System.out.println("   Not Empty");
		}
		
		//checking index of element
		System.out.println("Checking Index Of 17");
		System.out.println(al);
		System.out.println("Index Of 17 is: "+ al.indexOf(17));
		
		al.add(17);
		
		System.out.println("Checking Last Index Of 17 ");
		System.out.println(al);
		System.out.println("Index Of 17 is: "+ al.lastIndexOf(17));
		
		
	
	}

}

