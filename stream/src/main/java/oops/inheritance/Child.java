package oops.inheritance;

public class Child extends Mother{
	int s;
	public void test()  {
		System.out.println(this.getClass().getName()+" test");
	}
	
	public Child(){
		System.out.println("Inside constructor "+s);
	}
	{
		s=10;
        System.out.println("init block execute first when object is created time");
    }
	
	static{
        System.out.println("static block execute while Child class is invoked/imported time");
    }
	
	public static void main(String[] args) {
		System.out.println("hello");
		//upcasting = child object is typecasted to a parent class object.
		Mother m = new Child();
		m.test();
		
//		down casting is not allowed in java ; it will not give any compile time error but it will through runtime exception "ClassCastException"
//		Child c =(Child) new Mother();
//		c.test();
		
		
//		new Child(10).test();
//		Mother m = new Mother();
//		Mother m1 = new Mother();
	
		//
//		AbstractClass ac = new ConcreteClass(0);
//		ac.test(20);
	}

	
}
