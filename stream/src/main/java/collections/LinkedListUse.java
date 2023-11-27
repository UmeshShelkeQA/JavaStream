package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListUse {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		//ll.
		ll.add(10);
		ll.add(20);
		ll.add(15);
		ll.add(2, 22);
		ll.addFirst(9);
		ll.addLast(1);
		
		System.out.println("Linked List :"+ ll);
		ll.addAll(Arrays.asList(3,4,5,6));
		System.out.println("Linked List after addAll(list):"+ ll);
		ll.addAll(2,Arrays.asList(7,8));
		System.out.println("Linked List after addAll(index, list):"+ ll);
		Collections.sort(ll);
		System.out.println("Linked List after sorting : "+ ll);
		
		System.out.println("Getting Element Now");
		System.out.println("Getting Head Of LinkedList : "+ ll.getFirst());
		System.out.println("Getting Tail Of LinkedList : "+ ll.getLast());
		System.out.println("Getting 4th Element Of LinkedList :"+ ll.get(4));
		
		System.out.println("------------------------------");
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		
		System.out.println("----------------Adding--------------");
		System.out.println("20 is added :" + ll.offer(20));
		System.out.println("20 is added :" + ll.offerFirst(40));
		System.out.println("20 is added :" + ll.offerLast(60));
		System.out.println(ll);
		System.out.println("------------Searching------------------");
		System.out.println(ll.indexOf(20));
		System.out.println(ll.lastIndexOf(20));
		System.out.println(ll.contains(20));
		
		//remove operation
		System.out.println("---------------Deletion---------------");
		System.out.println(ll);
		System.out.println(ll.remove());
		System.out.println(ll.removeFirstOccurrence(20));
		System.out.println(ll.removeLastOccurrence(20));
		System.out.println(ll.remove(4));
		System.out.println(ll.remove((Object)60));
		System.out.println(ll);
		
		//stack & queue operation
		System.out.println("------------stack ------------------");
		System.out.println(ll.pop());
		ll.push(45);
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println("------------queue------------------");
		System.out.println(ll.element());
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
	}

}
