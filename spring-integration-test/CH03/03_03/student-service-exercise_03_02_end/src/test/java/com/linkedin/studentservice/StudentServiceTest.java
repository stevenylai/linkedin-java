package com.linkedin.studentservice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.BDDAssertions.then;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
@Transactional
public class StudentServiceTest
{
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @DisplayName("Get student details by id")
    @Test
    void getStudentById_forSavedStudent_isReturned()
    {
        //given
        Student savedStudent = studentRepository.save(new Student(null, "Mark"));

        //when
        Student retrievedStudent = studentService.getStudentById(savedStudent.getId());

        //then
        then(retrievedStudent.getName()).isEqualTo("Mark");
        then(retrievedStudent.getId()).isNotNull();
    }

}



