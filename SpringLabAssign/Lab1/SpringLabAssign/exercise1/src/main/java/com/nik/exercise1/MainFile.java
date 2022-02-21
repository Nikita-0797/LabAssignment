package com.nik.exercise1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nik.exercise1.entity.Employee;

public class MainFile {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("appcontext.xml");
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println("Employee Details");
		System.out.println("-------------------------");
		System.out.println("EmployeeId : "+emp.getEmployeeId());
		System.out.println("Employee Name : "+emp.getEmployeeName());
		System.out.println("Employee Salary : "+emp.getSalary());
		System.out.println("Employee BU :  "+emp.getBusinessUnit());
		System.out.println("Age: "+emp.getAge());
	}

}

}
