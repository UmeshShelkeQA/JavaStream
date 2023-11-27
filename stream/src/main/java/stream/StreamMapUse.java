package stream;

import java.util.Arrays;
import java.util.List;

public class StreamMapUse {
	public static void main(String[] args) {
		List<Employee> emp=Arrays.asList(
				new Employee(1,"umesh shelke",23000),
				new Employee(2,"priya pangavane",47000),
				new Employee(3,"danish shaikh",34000),
				new Employee(4,"vikas raut",30000)
				);
		System.out.println("-----------------------------------");
		emp.stream().map(e-> e.name).forEach(System.out::println);
		System.out.println("-----------------------------------");
		emp.stream().map(e->e.salary*2).forEach(System.out::println);
		System.out.println("-----------------------------------");
		emp.stream().map(e->e.id).forEach(System.out::println);
		System.out.println("-----------------------------------");
		emp.stream().map(e->e).forEach(System.out::println);
		
	}
}
