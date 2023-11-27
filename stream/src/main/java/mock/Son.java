package mock;


public class Son extends Father{
	String name;
	Son(String sonName, String fatherName){
		this.name = sonName;
		super.name = fatherName;
	}
	
	void show(){
		System.out.println("Son Name "+this.name);
		System.out.println("Father Name "+super.name);
	}

	public static void main(String arg[]){
		Son s = new Son("Umesh","Suresh");
		s.show();
	}
}