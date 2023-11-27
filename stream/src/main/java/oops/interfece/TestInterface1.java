package oops.interfece;

public abstract interface TestInterface1 {
	public void test();
	default void test3() {
		System.out.println("TestInterface1 ");
		//if we specify default access specifier to method then we should have write method defination inside a interface	
		System.out.println("Calling Private method of interface from default method test3()"+this.getClass().getName());
		
	}
	default void test6() {
		System.out.println("Default method test6() of TestInterface1");
	}
//	if we declare method as a default then we must have to provide body to her.
//	default void test3(int a); 
}
