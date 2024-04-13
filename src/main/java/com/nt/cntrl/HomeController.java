package com.nt.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;
import com.nt.service.EmpService;

@RestController
@RequestMapping("/emp")
public class HomeController {

	@Autowired
	private EmpService empService;

	@PostMapping("/add")
	public String add(@RequestBody Employee e) {
		empService.add(e);
		return "ok";
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Employee> getById(@PathVariable int id) {
		Employee e = empService.getDetailsById(id);
		return ResponseEntity.ok(e);
	}

	@GetMapping("/name/{name}")
	public List<Employee> getByName(@PathVariable String name) {
		return empService.getByName(name);
	}

	@GetMapping("/sal/{sal}")
	public List<Employee> getBySal(@PathVariable int sal) {
		return empService.getBySal(sal);
	}

	@GetMapping("/all")
	public List<Employee> findAllRecords() {
		return empService.all();
	}

	@PutMapping("/update")
	public String update(@RequestBody Employee e) {
		empService.update(e);
		return "ok";
	}

	@DeleteMapping("/id/{i}")
	public ResponseEntity<Employee> deleteById(@PathVariable("i") int id) {
		Employee e = empService.deleteRecord(id);
		return ResponseEntity.ok(e);
	}

}
