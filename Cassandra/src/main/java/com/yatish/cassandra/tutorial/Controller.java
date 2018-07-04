package com.yatish.cassandra.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yatish.service.StudentServiceImpl;

@RestController
public class Controller {

	@Autowired
	private StudentServiceImpl studentService;
	
	@RequestMapping("/execute")
	public String handle() {
		studentService.save();
		studentService.get();
		return "Success";
	}
}
