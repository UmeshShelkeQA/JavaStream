package collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorUse {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		vec.add(10);
		vec.insertElementAt(10, 1); // void and ArrayIndexOutOfBoundException
		vec.add(20); // boolean
		vec.add(1, 20); //void
		vec.add(1, 30);
		vec.addElement(40); //void
		vec.addElement(50);
		vec.addElement(60);
		vec.addElement(70);
		
		System.out.println("Vector :"+ vec);
		System.out.println("Vector Capacity :"+ vec.capacity());
		vec.ensureCapacity(15);
		System.out.println("Vector Setting Up Min Capacity : "+ vec.capacity() );
		System.out.println("Vector :"+ vec);
		
		//retriving
		System.out.println("vec.elementAt(2) :"+ vec.elementAt(2));
		System.out.println("vec.firstElement() :"+ vec.firstElement());
		System.out.println("vec.lastElement() :"+ vec.lastElement());
		System.out.println("vec.get(1) :"+ vec.get(1));
		System.out.println("vec.contains(40) : "+ vec.contains(40));
		System.out.println("vec.contains(50) :"+ vec.contains(50));
		
		System.out.println(vec);
		//removing from vector
		System.out.println("vec.remove(1) : "+ vec.remove(1)); // remove and return element at specified position or throw exception
		System.out.println("vec.remove((Integer)40) :" + vec.remove((Integer)40)); // boolean
		System.out.println("vec.removeElementAt(1) :");
		vec.removeElementAt(1); //void or Throw Exception ArrayIndexOutOfBoundException 
		System.out.println("vec.removeElement(10) : " + vec.removeElement(10)); // return True Or False
		System.out.println(vec);
		
		System.out.println("Size of the Vector :"+ vec.size());
		System.out.println("Index of 20 :"+ vec.indexOf(20));
		System.out.println("Index of 20 :"+ vec.lastIndexOf(20));
		System.out.println("Index of 20 :"+ vec.isEmpty());
		System.out.println(vec);
		System.out.println("After vec.set(1,80) ->" + vec.set(1,80));
		
		vec.setElementAt(90, 0);
		System.out.println(vec);
		
		System.out.println("===================Iterating using enumuration==================");
		Collections.reverse(vec);
		Enumeration<Integer> enumIterator = vec.elements();
		while(enumIterator.hasMoreElements()) {
			System.out.println(enumIterator.nextElement());
		}
		
	}

}
