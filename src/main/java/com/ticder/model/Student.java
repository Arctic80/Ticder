package com.ticder.model;

import com.ticder.exception.NameRequiredException;

public class Student
{
    private static int lastId = 1;
    private int id;
    private String name;

    public Student(String name) throws NameRequiredException
    {
        if (name.equals("")) throw new NameRequiredException();
        id = lastId;
        lastId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}