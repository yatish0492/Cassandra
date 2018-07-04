package com.yatish.pojos;


import javax.persistence.Entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("students")
@Entity(name="abc")
public class Student {
	
	@PrimaryKey
	public Integer studentId;
	public String name;
	
	public Student() {}
	
	public Student(Integer studentId,String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
