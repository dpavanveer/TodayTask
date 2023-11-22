package com.student.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.student.model.Student;
@Service
public interface Studentservice {
public List<Student>getAllStudents();
}

