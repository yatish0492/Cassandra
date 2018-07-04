package com.yatish.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import com.yatish.pojos.Student;

@Repository
public interface StudentRepository extends CassandraRepository<Student,UUID>{
	
	@Query(value="SELECT * FROM Students WHERE name=?0 ALLOW FILTERING")
	public List<Student> findByName(String name);
	
	@Query(value="SELECT * FROM Students")
	public List<Student> findByAll();

}
