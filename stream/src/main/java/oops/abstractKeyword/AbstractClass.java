package oops.abstractKeyword;

public abstract class AbstractClass {
	int a;
	AbstractClass(int a){
		this.a = a;
	}
	AbstractClass(){
		this(10);
	}
	protected abstract void test();
	
	public abstract void test(int a);
	
	abstract void test(String a);
	abstract void test5();
	
//	private abstract void test6(boolean a); we can not declare private abstract method
	
//	public static abstract void test4(); we can not declare static abstract method

	static public void test3() {
		System.out.println("Static method in abstract class");
	}
	//default block
	{
		System.out.println("Default Block in Abstract Class");
	}
	static {
		System.out.println("Static Block in Abstract Class");
	}

	
	void test1() {
		hello();
		System.out.println("AbstractClass test1 method");
	}
	private void hello() {
		System.out.println("Private method in abstract class");
	}
}
