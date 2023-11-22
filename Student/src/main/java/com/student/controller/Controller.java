

package com.student.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.Studentservice;

@RestController
@RequestMapping("/std/")
public class Controller {
	@Autowired
	Studentservice Studentservice;

	@GetMapping("/student")
	public List<Student> getAllStudents() {
		return Studentservice.getAllStudents();
	}
}
