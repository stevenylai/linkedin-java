package com.linkedin.studentservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{
    Student getStudentByName(String name);
}
