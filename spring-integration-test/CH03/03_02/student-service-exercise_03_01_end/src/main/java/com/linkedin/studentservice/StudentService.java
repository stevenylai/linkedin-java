package com.linkedin.studentservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService
{
    private final StudentRepository studentRepository;

    public Student getStudentById(Long id)
    {
        return studentRepository.findById(id).orElse(null);
    }
}
