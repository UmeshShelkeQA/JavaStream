package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterUse {

	public static void printNumber(int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		System.out.println((int)Math.pow(10, 3));


		List<Integer> list = Arrays.asList(1,2,3,6,34,23,46,78,45);
		//storing filtered list in filterList variable
		List<Integer>filterList =list.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println("Filtered List : "+filterList);

		//not stoaring filtered Data in any variable instead printing that data
		System.out.println("Printing Numbers With sysout statement");
		list.stream().filter(num->num%2==0).forEach(num->System.out.println(num));
		System.out.println("Printing Numbers with sysout method reference");
		list.stream().filter(num->num%2==0).forEach(System.out::println);

		System.out.println("Using custom function to print or process the number");
		list.stream().filter(num->num%2==0).forEach(StreamFilterUse::printNumber);

		System.out.println("Getting sqrt of all numbers");
		list.stream().filter(num->num%2==0).forEach(s->System.out.println(Math.sqrt(Double.valueOf(s))));

		System.out.println("==============================================");
		//on custom class list 
		List<Employee> emp=Arrays.asList(
				new Employee(1,"umesh",23000),
				new Employee(1,"priya",47000),
				new Employee(1,"danish",34000),
				new Employee(1,"vikas",30000)
				);
		emp.stream().filter(e->e.salary>30000).forEach(System.out::println);
		System.out.println("==============================================");
		List<Employee> filteredEmp= emp.stream().filter(e->e.salary>30000).collect(Collectors.toList());
		System.out.println(filteredEmp);
		System.out.println("==============================================");


	}

}
