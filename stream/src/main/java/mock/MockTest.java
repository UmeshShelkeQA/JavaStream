package mock;

public class MockTest {

	private String name= "Umesh Shelke"; // shelke umesh
	
	public String getReverse() {
		String firstNAme = "";
		String lastName = "";
		
		firstNAme = name.substring(0,name.indexOf(" "));
		lastName = name.substring(name.indexOf(" ")+1, name.length());
		return lastName + " " + firstNAme ;
	}
	
	//only public, protected and private allowed
	private MockTest() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		
		MockTest mt = new MockTest();
		System.out.println("Original String : "+mt.getName() +"\nReverse Name String : " + mt.getReverse());
	}
}
