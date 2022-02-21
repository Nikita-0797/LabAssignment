package com.nik.exercise4.dao;

import java.util.List;

import com.nik.exercise4.entity.Employee;

public class EmpDao {

	private List<Employee> emplist;
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
		System.out.println(this.emplist);
	}
	public Employee getDetails(int empId){
		for(Employee data:emplist){
			if(data.getEmployeeId()==empId)
				return data;
		}
		return null;
	}
}
