package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceInterface;


public class MainFile {

	public static void main(String[] args) {
		EmployeeServiceInterface emp = new EmployeeServiceInterface();
		Employee emp1 = emp.getEmpDetails();
		String scheme = emp.insuranceScheme(emp1.designation, emp1.salary);
		Employee person = new Employee(emp1.id,emp1.name,emp1.designation,scheme,emp1.salary);

		//System.out.println(emp1.name);
		//emp.insuranceScheme();
		emp.EmpDetails(person);
		

	}
}