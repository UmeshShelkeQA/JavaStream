package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapUse {

	public static void main(String[] args) {
		List<Employee> emp1=Arrays.asList(
				new Employee(1,"umesh shelke",23000),
				new Employee(2,"priya pangavane",47000),
				new Employee(3,"danish shaikh",34000),
				new Employee(4,"vikas raut",30000)
				);
		List<Employee> emp2=Arrays.asList(
				new Employee(1,"sam shelke",24000),
				new Employee(2,"shubham shelke",75000),
				new Employee(3,"Akash Kadam",43000),
				new Employee(4,"yuvaraj choudhari",31000)
				);
		List<List<Employee>> listEmp = Arrays.asList(emp1,emp2);
		
		System.out.println("Getting Only All names emp");
		listEmp.stream().flatMap(list -> list.stream()).map(e->e.name).forEach(System.out::println);
		System.out.println("----------------------------------------");
		System.out.println("Getting All Emp salary");
		listEmp.stream().flatMap(e->e.stream()).map(e->e.salary).forEach(System.out::println);
		System.out.println("----------------------------------------");
		System.out.println("Gettings ids of all emp");
		listEmp.stream().flatMap(e->e.stream()).map(e->e.id).forEach(System.out::println);
		System.out.println("----------------------------------------");
		int sumOfId=listEmp.stream().flatMap(e->e.stream()).mapToInt(e->e.id).sum();
		int minOfId=listEmp.stream().flatMap(e->e.stream()).mapToInt(e->e.id).min().getAsInt();
		int maxOfId=listEmp.stream().flatMap(e->e.stream()).mapToInt(e->e.id).max().getAsInt();
		System.out.println("Sum Of Emp Id : "+sumOfId);
		System.out.println("Min Of Emp Id : "+minOfId);
		System.out.println("Max Of Emp Id : "+maxOfId);
		
		System.out.println("---------------------------------------------------");
		Double salarySum=listEmp.stream().flatMap(e->e.stream()).mapToDouble(e-> e.salary).sum();
		Double salaryMin=listEmp.stream().flatMap(e->e.stream()).mapToDouble(e-> e.salary).min().getAsDouble();
		Double salaryMax=listEmp.stream().flatMap(e->e.stream()).mapToDouble(e-> e.salary).max().getAsDouble();
		System.out.println("Sum Of All Emp Salary: "+salarySum);
		System.out.println("Min Of All Emp Salary: "+salaryMin);
		System.out.println("Max Of All Emp Salary: "+salaryMax);
	
		System.out.println("---------------------------------------------------");
		long cnt=listEmp.stream().flatMap(e->e.stream()).mapToDouble(e-> e.salary).count();
		System.out.println("Employee Count : "+cnt);
		System.out.println("---------------------------------------------------");
		System.out.println("Getting Distinct Ids");
		List<Integer> uniqueEmp = listEmp.stream().flatMap(e->e.stream()).map(e->e.id).distinct().collect(Collectors.toList());
		System.out.println("Unique Emp ids : "+uniqueEmp);
		
	}

}
