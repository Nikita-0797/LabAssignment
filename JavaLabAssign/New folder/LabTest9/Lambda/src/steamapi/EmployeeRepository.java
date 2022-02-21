package steamapi;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeRepository {
	public static void main(String[] args) {
		Department dept = new Department(1, 10, "Management");
		Department dept1 = new Department(2, 20, "IT");
		List<Employee> empList = new ArrayList<Employee>();
		empList = Arrays.asList(
				new Employee(100, 1, "Utkarsh", "Sawant", "utk44@gmail.com", "9582647822", "Executive",
						LocalDate.of(2019, 2, 21), 25000d, dept),
				new Employee(201, 2, "Shweta", "Pawar", "shwetz18@gmail.com", "9058694237", "Analyst",
						LocalDate.of(2021, 2, 11), 30000d, dept1),
				new Employee(103, 2, "Nikita", "Kangude", "nik77@gmail.com", "9325846478", "Analyst",
						LocalDate.of(2022, 2, 05), 20500d, dept),
				new Employee(102, 2, "Pratiksha", "Salunkhe", "pratu@gmail.com", "7358469785", "Analyst",
						LocalDate.of(2021, 2, 17), 20000d, dept),
				new Employee(101, 2, "Ajinkya", "Dombe", "ajinkya8a@gmail.com", "8082548812", "Analyst",
						LocalDate.of(2020, 2, 20), 23000d, dept),
				new Employee(202, 1, "Pranoti", "Phalke", "pranotipp@gmail.com", "7056848499", "Executive",
						LocalDate.of(2019, 2, 10), 20000d, dept1));
		for (Employee e : empList) {
			System.out.println(e);
		}
		System.out.println("\n\nQ1. Find out the sum of salary of all employees.\n");
		Optional<Double> o = empList.stream().map(emp -> emp.getSalary()).reduce((a, b) -> (a + b));
		if (o.isPresent()) {
			System.out.println("Sum of all Salaries: " + o.get());
		}
		System.out.println("\n\nQ2. List out department names and count of employees in each department.\n");
		Map<Department, Long> de = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(de);
		LocalDate d = LocalDate.now();
		System.out.println("\n\nQ3. List employee name and duration of their service in months and days.");
		empList.forEach(e -> System.out.println(e.getFirstName() + "\t " + Period.between(d, e.getHireDate())));
		System.out.println("\n\nQ4. Sort employees by their\r\nEmployee id\r\nDepartment id\r\nFirst name.");
		System.out.println("\nsorting by employee id: ");
		List<Employee> e1 = empList.stream().sorted((a, b) -> a.getId() - (b.getId()))
				.collect(Collectors.toList());
		System.out.println(e1);
		for (Object a : e1) {
			System.out.println(a);
		}
		System.out.println("\nsorting by First Name: ");
		e1 = empList.stream().sorted(Comparator.comparing(Employee::getFirstName))
				.collect(Collectors.toList());
		System.out.println(e1);
		for (Object a : e1) {
			System.out.println(a);
		}
		System.out.println("\n\nQ5. Find departments with highest count of employees.");
		de = empList.stream().limit(1)
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(de);
		for (Object a : e1) {
			System.out.println(a);
		}
	}
}