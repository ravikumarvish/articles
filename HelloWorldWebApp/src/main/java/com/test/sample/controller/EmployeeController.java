package com.test.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.sample.bean.Employee;
import com.test.sample.exception.EmployeeBadRequestException;
import com.test.sample.exception.EmployeeNotFoundException;
import com.test.sample.exception.EmployeeRunTimeException;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") String id) {
		if (id.equals("10000")) {
			return new ResponseEntity<Employee>(new Employee("10000", "Ravi Kumar"), HttpStatus.OK);
		} else if (id.equals("20000")) {
			String message = "20000 exist in system. But while fetching record from database. datbase connection went down. Something wrong happened there.";
			System.out.println(message);
			throw new EmployeeRunTimeException(message);
		} else if (id.equals("0")) {
			String message = "Employee id can not be zero";
			System.out.println(message);
			throw new EmployeeBadRequestException(message);
		} else {
			String message = "Employee with given id : " + id + "does not exist in system.";
			throw new EmployeeNotFoundException(message);
		}
	}
}
