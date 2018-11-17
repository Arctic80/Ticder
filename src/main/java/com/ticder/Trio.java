package com.ticder;

import java.util.Set;


public class Trio
{
    private final Set<Student> students;

    public Trio(Student s1, Student s2, Student s3)
    {
        students = Set.of(s1, s2, s3);
    }
}