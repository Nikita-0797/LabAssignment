package com.nik.exercise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nik.exercise2.entity.Employee;

public class MainFile {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("appcontext2.xml");
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println("Employee Details");
		System.out.println("-------------------------");
		System.out.println("Employee {empAge="+emp.getAge()+", empId="+emp.getEmployeeId()+", empName="+emp.getEmployeeName()+", empSalary="+emp.getSalary()+"}");
		System.out.println("sbu details=SBU {sbuCode="+emp.getBusinessUnit().getSbuId()+", sbuHead="+emp.getBusinessUnit().getSbuHead()+", sbuName="+emp.getBusinessUnit().getSbuName()+"}");
		
		
	}

}
