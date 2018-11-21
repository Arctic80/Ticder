package com.ticder.model;

import java.util.Set;


public class Trio extends Group
{
    public Trio(Student s1, Student s2, Student s3) {
        super(Set.of(s1, s2, s3));
    }
}