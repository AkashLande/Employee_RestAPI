package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import com.nt.dao.EmpDao;
import com.nt.entity.Employee;

@Component
public class EmpService {

	@Autowired
	private EmpDao dao;

	public void add(Employee e) {
		dao.save(e);
	}

	public Employee getDetailsById(int id) {
		Employee e = dao.findById(id);
		return e;
	}

	public List<Employee> getByName(String name) {
		return dao.findByName(name);
	}

	public List<Employee> getBySal(int sal) {
		return dao.findBySal(sal);
	}

	public List<Employee> all() {
		List<Employee> list = dao.findAll();
		return list;
	}

	public void update(Employee e) {
		dao.save(e);
	}

	public Employee deleteRecord(int id) {
		Employee e = dao.deleteById(id);
		return e;
	}

}
