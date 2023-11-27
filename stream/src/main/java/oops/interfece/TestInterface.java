package oops.interfece;

public interface TestInterface {
	
	//we can only use public, static and final with variable in interface
	int s=10;
	
	//interface can not have constructor
	//	TestInterface(){
//		
//	}
	//we can not write method defination of public method inside interface
	public void test(); // by default methods are public & abstract // empty static method not allowed
	//protected void test(); Illegal modifier for the interface method test; only public, private, abstract, default, static and strictfp are permitted

	default void test3() {
		//if we specify default access specifier to method then we should have write method defination inside a interface
		System.out.println("TestInterface ");
		System.out.println("Calling Private method of interface from default method test3()" + this.getClass().getName());
		testPrivateMethod();
		test4();
		test5();
	}
//	default static void test4() {
//		only one of abstract, default, or static permitted
//	}
	private void testPrivateMethod() {
		//
		System.out.println("hi im private method of TestInterface");
	}
	
	int a=10;
//	public static void test2(); we have to write static method defination in interface // static abstract method are not allowed in interface 
	public static void test1() {
		
		//we can declare static method in interface 
		System.out.println("i'm inside public static void test1() : TestInterface");
	}
	private static void test4() {
		
		//we can declare static method in interface 
		System.out.println("i'm inside 	private static void test4()");
	}
	static void test5() {
		
		//we can declare static method in interface 
		System.out.println("i'm inside 	static void test5()");
	}
	
	default void test6() {
		System.out.println("Default method test6() of TestInterface");
	}
}
