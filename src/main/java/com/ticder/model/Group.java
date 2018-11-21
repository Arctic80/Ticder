package com.ticder.model;

import java.util.Set;


public abstract class Group
{
    protected final Set<Student> students;

    public Group(Set<Student> students) {
        this.students = students;
    }

    public Set<Student> getStudents() {
        return students;
    }
}
