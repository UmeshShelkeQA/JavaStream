package stream;

public class Employee {
	int id;
	String name;
	double salary;
	public Employee(){
		
	}
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
//	public String toString() {
//		String str= "{%d,%s,%f}";
//		return String.format(str, id,name,salary);
//	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
