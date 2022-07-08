package com.linkedin.studentclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

import static org.assertj.core.api.BDDAssertions.then;

@SpringBootTest
@AutoConfigureWireMock
public class StudentClientTest
{
    @Autowired
    private StudentClient studentClient;

    @Test
    void getStudent_forGivenStudent_isReturned()
    {


        //given
        Long studentId = 1l;

        //when
        Student student = studentClient.getStudent(studentId);

        //then
        then(student.getId()).isNotNull();
        then(student.getStudentName()).isEqualTo("Mark");
        then(student.getGrade()).isEqualTo(10);

    }
}
