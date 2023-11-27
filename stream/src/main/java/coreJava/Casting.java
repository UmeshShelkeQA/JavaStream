package coreJava;

import oops.inheritance.Child;
import oops.inheritance.Mother;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mother m =new Mother();
		Child ch = new Child();
		
		System.out.println("==============================Mother=================================================");
		m.test();
		System.out.println("====================================Child===========================================");
		ch.test();
		System.out.println("===============================================================================");
		
		m = ch;
		m.test();
	}

}
