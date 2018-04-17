package com.ifi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ifi.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByNameContaining(String q);

}