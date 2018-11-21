package com.ticder.controller;

import com.ticder.exception.NameRequiredException;
import com.ticder.exception.NotFoundException;
import com.ticder.model.Student;
import com.ticder.persistence.StudentRepository;


public class StudentController
{
    StudentRepository studentRepo = StudentRepository.getInstance();

    public void createStudent(String name) throws NameRequiredException
    {
        Student student = new Student(name);
        studentRepo.addStudent(student.getId(), student);
    }

    public void deleteStudent(int id) throws NotFoundException
    {
        studentRepo.deleteStudent(id);
    }

}