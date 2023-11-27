package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetUse {

	public static void main(String[] args) throws InterruptedException {
		Set<Integer> intSet = new LinkedHashSet<Integer>();

		for(int i=0; i<10; i++) {
			intSet.add(i);
		}


		System.out.println("Set :"+ intSet);
		System.out.println("Printing set using Iterator loop");

		Iterator<Integer> iterator = intSet.iterator();

		while(iterator.hasNext()  ) {
			System.out.print( iterator.next() + ", ");
		}

		System.out.println("\nPrinting set using forEach loop");

		intSet.forEach( (i) ->{
			System.out.print( i + ", ");
		});

		System.out.println("\nChecking set contains element or not");
		if(intSet.contains(7)) {
			System.out.println("\nSet Contains : 7");
		}

		System.out.println("\nRemoving Element from set");
		if(intSet.remove(7)) {
			System.out.println("Removed From Set : 7");
		}
		if(intSet.remove(7)) {
			System.out.println("Removed From Set : 7");
		}

		List<Integer> intList = new ArrayList<>(intSet);
		for(int i: intList) {
			System.out.print(i+", ");
		}

		Collections.shuffle(intList);

		List<Integer> arrTemp = new ArrayList<Integer>(intSet);
		Collections.shuffle(arrTemp);
		System.out.println("\nBefore Sort : "+arrTemp);
		Collections.sort(arrTemp, Comparator.reverseOrder());
		System.out.println("After Reverse Sort : "+arrTemp);
		Collections.sort(arrTemp, Comparator.naturalOrder());
		System.out.println("After NaturalOrder Sort : "+arrTemp);

		System.out.println("\nordering based on Even Numbers");
		//Collections.sort(arrTemp, (o1, o2)-> { return o1%2==0?-1:1;	});
		//detailed Logic
		Collections.shuffle(arrTemp);
		System.out.println("Before Sorting: "+arrTemp);
		Collections.sort(arrTemp, Comparator.naturalOrder());
		System.out.println("Before Sorting Applying natural Sort : "+arrTemp);
		Collections.sort(arrTemp, (o1, o2)-> {
			if(o1%2==0 && o2%2==0)
				return 0;
			else if(o1%2==0 && o2%2==1)
				return 1;
			else
				return -1;	
		});
		System.out.println("Custom Sort : "+arrTemp);

		//Collections only accept List 
		//Collections.binarySearch(intSet, 8);
		System.out.println("\n"+ Collections.binarySearch(intList, 8));

		Collections.shuffle(intList);
		System.out.println(intList);
		//Collections.binarySearch need sorted list 
		System.out.println("\n"+ Collections.binarySearch(intList, 8));

	}

}
