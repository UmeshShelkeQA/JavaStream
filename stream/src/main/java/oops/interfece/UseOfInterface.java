package oops.interfece;


interface test{
	int a=10;
	void test();
	
}

//if we declare same default method in both interface then we have to override this message
public class UseOfInterface implements TestInterface,TestInterface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface.test1();
		UseOfInterface ti=new UseOfInterface();
//		ti.test();
		ti.test();
		ti.test3();
	}
	UseOfInterface(){
		 
	}
	
	//we can not increase or decrease visibility level of interface in Implementation class but we can increase the visibility level of abstract class methods in concreate class
	@Override
	public void test() {
		
		// TODO Auto-generated method stub
		System.out.println("hello i'm from "+a);
	}
	
	@Override
	public void test3() {
//		if both interface contains same methods then we have to override that method in implementation class 
//		and if want to access that method of a perticular interface then we can access that method using INTERFACE.super.MethodName 
		
		//accessing TestInterface1 test3() method
		TestInterface1.super.test3();
		
		//accessing TestInterface1 test3() method
		TestInterface.super.test3();
				
		
	}
	
	@Override
	public void test6() {
		// TODO Auto-generated method stub
		
	}
	

}
