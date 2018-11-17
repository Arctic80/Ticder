package com.ticder;

public class Student
{
    private static int lastId = 1;
    private Integer id;
    private String name;

    public Student(String name) throws NameRequiredException
    {
        if (name.equals("")) throw new NameRequiredException();
        id = lastId;
        lastId++;
        this.name = name;
    }
}
