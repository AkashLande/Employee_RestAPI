package com.nt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Employee;

public interface EmpDao extends CrudRepository<Employee, Integer>{

	public Employee findById(int id);

	public List<Employee> findByName(String name);

	public List<Employee> findBySal(int sal);
	
	public List<Employee> findAll();
	
	public Employee deleteById(int id);

}
