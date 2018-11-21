package com.ticder.persistence;

import com.ticder.exceptions.NotFoundException;
import com.ticder.model.Student;

import java.util.*;


public class StudentRepository
{
    private static StudentRepository instance = new StudentRepository();
    private Map<Integer, Student> students = new HashMap<>();

    private StudentRepository() {}

    public static StudentRepository getInstance() {
        return instance;
    }

    public void addStudent(int id, Student student)
    {
        students.put(id, student);
    }

    public void deleteStudent(int id) throws NotFoundException
    {
        if (students.remove(id) == null) throw new NotFoundException();
    }

    public Map<Integer, Student> getStudents() throws NotFoundException
    {
        if (students.isEmpty()) throw new NotFoundException();
        return students;
    }
}