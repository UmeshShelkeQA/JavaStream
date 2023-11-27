package coreJava;

import java.util.HashMap;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// java can not perform casting automatically between String, StringBuffer, StringBuilder 
		// to convert StringBuffer, StringBuilder to String we use toString() method
		
		String s= "hello"; // immutable in nature & not thread safe
		StringBuffer sb=new StringBuffer(); // muttable in nature & thread safe
		StringBuilder sb1=new StringBuilder(); // muttable in nature & not-thread safe
		sb.append("hello");
		
		
		String temp = "helLo*woRld,*how*z*are*yOu";
		
		//find out occurance of all character present in string
		//we will use here hashMap
		HashMap<Character,Integer> mp = new HashMap<>();
		for(char c: temp.toCharArray()) {
			if(!mp.containsKey(c)) {
				mp.put(c, 1);
			}else {
				int charCnt = mp.get(c);
				mp.put(c, ++charCnt);
			}
		}
		System.out.println("Count of all characters in String :"+mp);
		
		//Replace All Spaces with '-'
		System.out.println("Replacing All Spaces With '-': "+ temp.replace('*', '-'));
		
		//Make All Words First Character Upper Case
		String[] wordsArr = temp.split("\\*");
		StringBuffer camelCaseString = new StringBuffer();
		
		for(String str: wordsArr) {
			String ss = String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1).toLowerCase();
			camelCaseString.append(ss+" ");
			
		}
		System.out.println("Camel Case String: " + camelCaseString);
		
		
		System.out.println("int Type Casting to char : "+(char)65); 
		System.out.println("int Type Casting to char : "+(char)(65+25));
		System.out.println("int Type Casting to char : "+(char)97);
		System.out.println("int Type Casting to char : "+(char)(97+25));
		
		//String To Integer
		System.out.println("String To Integer : "+ Integer.valueOf("123") );
		System.out.println("String To Integer : "+ Integer.parseInt("123") );
		
		//used regex here ^= outside square bracket represent at the Start of String
		// and [^A-Z] = represent does not match character range of A-Z
		System.out.println("Replace Special Character From String : "+temp.replaceAll("[^A-Za-z ]", ""));
		System.out.println("Replace Special Character At the Start : "+temp.replaceAll("^helLo", "Changed"));
		System.out.println("Replace Special Character At the Start : "+temp.replaceAll("^lLo", "Changed"));	
		//not available in StringBuffer class. toLowerCase(), sb.toUpperCase(); 
		
		int tempInt  = 10;
		String temp2="Hello" + tempInt;
		System.out.println(temp2);
	}

}
