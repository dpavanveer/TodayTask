package com.student.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.model.Student;
import com.student.repository.StudentRepository;


@Service
public class StudentServiceImpl implements Studentservice{

@Autowired
StudentRepository studentRepository;
 
@Override
public List<Student> getAllStudents() {
	
return studentRepository.findAll();
}
}

