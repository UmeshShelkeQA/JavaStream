package coreJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

interface MyFunctionalInterface{
	int add(int i,int j);
}
interface MyFunctionalInterface1{
	int add(int i,int j);
	int add(int i,int j, int k);
}

public class StringClassMethod {

	public static void main(String[] args) throws CloneNotSupportedException {
		String s="Hello World, How Are You";

		//String Class don't have reverse method
		System.out.println("new StringBuffer(s).reverse() : " +new StringBuffer(s).reverse());
		System.out.println("s.replaceAll(\"[^a-zA-Z0-9 ]\", \"\") : " +s.replaceAll("[^a-zA-Z0-9 ]", ""));
		System.out.println("s.charAt(1) : " +s.charAt(1));
		System.out.println("s.toUpperCase() : " +s.toUpperCase());
		System.out.println("s.toLowerCase() : " +s.toLowerCase());
		System.out.println("s.split(\" \").getClass().getName() + \" Original Class: \"+s.getClass().getName() : " +s.split(" ").getClass().getName() + " Original Class: "+s.getClass().getName());
		System.out.println("s.toCharArray() : " +s.toCharArray());
		System.out.println("s.length() : " +s.length());
		System.out.println("s.replace(' ','-') : " + s.replace(' ','-'));
		System.out.println("s.substring(2,3) : " + s.substring(2,3));
		System.out.println("s.replaceFirst(\"^Hello\",\"Changed\") : " + s.replaceFirst("^Hello","Changed"));
		System.out.println("s.replaceAll(\"H\",\"Z\") :" + s.replaceAll("H","Z"));

		System.out.println(".indexOf(int ch)"+ s.indexOf('Z', 4)); // only positive number will give result otherwise return -1

		//object creation using lambda expression
		MyFunctionalInterface obj = (int a, int b) -> {
			// Implementation here
			return a+b;
		};

		System.out.println("Addition of 4,5 Using Lambda Expression: "+obj.add(4, 5));
		System.out.println("Addition of 9,5 Using Lambda Expression: "+obj.add(9, 5));

		//object creation using Anonymous inner class
		MyFunctionalInterface1 obj1 = new MyFunctionalInterface1() {
			// Implementation here
			public int add(int i, int j) {
				return i+j;
			}
			public int add(int i, int j, int k) {
				return i+j+k;
			}
		};

		System.out.println("Addition of 4,5 Using Anonymous Inner Class obj: "+obj1.add(41, 35));
		System.out.println("Addition of 9,5 Using Anonymous Inner Class obj: "+obj1.add(10, 25, 5));


		//sorting sentence by word
		String[] words = s.split(" ");

		for(int i=0; i<words.length; i++) {
			for(int j=i; j<words.length; j++) {
				if(words[i].compareTo(words[j]) > 0) {
					String temp = words[i];
					words[i]=words[j];
					words[j] = temp;
				}
			}
		}
		StringBuffer sortSentenceBuffer = new StringBuffer();
		String sortSentence = "";
		for(String temp : words) {
			sortSentenceBuffer.append(temp+" ");
			sortSentence = sortSentence.concat(temp+" ");
		}
		System.out.println("(StringBuffer) The Asc Sorted Sentence Is: " + sortSentenceBuffer);
		System.out.println("(String) The Asc Sorted Sentence Is: " + sortSentence);
		
		//StringBuffer Class Important Method
		sortSentenceBuffer.indexOf("");
		sortSentenceBuffer.append("");
		sortSentenceBuffer.substring(0,3);
		sortSentenceBuffer.reverse();
		sortSentenceBuffer.charAt(0);
		sortSentenceBuffer.delete(2, 5);
		sortSentenceBuffer.deleteCharAt(1);
		sortSentenceBuffer.insert(0, "");
		sortSentenceBuffer.insert(0, false);
		sortSentenceBuffer.insert(0, 10);
		sortSentenceBuffer.insert(0, 'f');
		sortSentenceBuffer.replace(2, 4, "Z");
	}

}
