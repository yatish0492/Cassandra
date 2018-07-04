package com.yatish.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yatish.pojos.Student;
import com.yatish.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repository;

	public void save() {
		Student obj = new Student(1,"yatish");
		repository.save(obj);
	}
	
	public void get() {
		List<Student> list = repository.findByName("yatish");
		System.out.println("-------------- Fetched Student Object is ----------------------");
		System.out.println("id - " + list.get(0).studentId + " name - " + list.get(0).name);
	}
}
