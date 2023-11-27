package oops.inheritance;

public class Mother extends GrandMother{
	public void test() {
		System.out.println(this.getClass().getName()+" test");
	}
	public void upCastingTest() {
		System.out.println("Upcasting example method which is not present in sub-class");
	}
	//private Mother() { we cannot use this outside of class 
	public Mother(){
		super();
	}
	public Mother(int s) {
		this(s,10);
		System.out.println(s);
	}
	
	private Mother(int s, int p){
		System.out.println("S :"+s+" P :"+p);
	}
	
	{
        System.out.println("init block execute while object creation time");
    }
	static{
        System.out.println("static block execute while mother class is invoked/imported time");
    }
	
}
