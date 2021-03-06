package com.nik.exercise4;


import java.util.Scanner;


import com.nik.exercise4.dao.EmpDao;
import com.nik.exercise4.entity.Employee;
import com.nik.exercise4.service.EmpServiceImpl;
import com.nik.exercise4.service.EmployeeService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainFile {
	
	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("exercise_4.xml");
		
		EmpDao sbu = context.getBean("emp",EmpDao.class);
		System.out.println("Enter Employee Id : ");
		Scanner s=new Scanner(System.in);
		int empId=s.nextInt();
		EmpServiceImpl empService=new EmpServiceImpl();
		Employee emp=empService.getDetails(empId);
		if(emp==null){
			System.out.println("No Employee Exist");
		}
		else{
			System.out.println("Employee Id: "+emp.getEmployeeId());
			System.out.println("Employee Name: "+emp.getEmployeeName());
			System.out.println("Employee Salary: "+emp.getSalary());
		}
	}

}

