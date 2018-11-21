package com.ticder.model;

import java.util.Set;


public class Pair extends Group
{
    public Pair(Student s1, Student s2){
        super(Set.of(s1, s2));
    }
}