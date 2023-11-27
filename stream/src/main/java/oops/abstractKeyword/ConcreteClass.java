package oops.abstractKeyword;

/* Error : The public type Temp must be defined in its own file
public abstract class Temp{
	Temp(){
		System.out.println("Temp Abstract Class.");
	}
}
*/

public class ConcreteClass extends AbstractClass{

	public ConcreteClass(int a) {
		// TODO Auto-generated constructor stub
		super(a);
	}
	
	ConcreteClass(){
		super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteClass s = new ConcreteClass(20);
		s.test();
		s.test(10);
		s.test("umesh");
		s.test1();
		AbstractClass.test3();
		System.out.println("variable of abstract-class :"+s.a);
		//s.test2();// we can not access concrete class methods via abstract-class reference variable
		// we only access methods that is declared in AbstractClass via AbstractClass reference variable
	}

	@Override
	protected void test() {
		// TODO Auto-generated method stub
		System.out.println("concreate class test()");
	}

	@Override
	public void test(int a) {
		
		// TODO Auto-generated method stub
		System.out.println("concreate class test(int a)");
	}

	@Override
	void test(String a) {
		// TODO Auto-generated method stub
		System.out.println("concreate class test(String a)");
	}

	void test2() {
		System.out.println("concrete test2");
	}

	@Override
	protected void test5() {
		System.out.println("concreate class test5()");
		
	}
}
