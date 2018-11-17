package com.ticder;

import java.util.Set;


public class Pair
{
    private final Set<Student> students;

    public Pair(Student s1, Student s2)
    {
        students = Set.of(s1, s2);
    }
}