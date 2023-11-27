package mock;

public class Father{

	String name;
	Father(String name){
		this.name = name;
	}
	Father(){
		
	}
	void showName(){
		System.out.println("Father Name "+name);
	}
}