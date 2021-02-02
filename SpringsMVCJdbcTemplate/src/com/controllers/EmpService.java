package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnp.dto.Employee;

 

@Service("empService")
public class EmpService {
	
	@Autowired
	EmpDao empDao;
	public void saveEmployee(Employee employee) {
		empDao.saveEmployee(employee);
	}
	 public List<Employee> getAllEmployees() {
			return empDao.getAllEmployees();
		}

	 public boolean deleteEmployee(Employee emp) {
			return empDao.deleteEmployee(emp);
		}
	 public boolean deleteEmployeeByName(Employee emp) {
			return empDao.deleteEmployeeByName(emp);
		}


		public Employee getEmpById(int empId) {
			return empDao.getEmpById(empId);
		}
  }
  
