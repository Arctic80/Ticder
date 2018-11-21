package com.ticder.controller;

import com.ticder.exception.NotFoundException;
import com.ticder.model.Group;
import com.ticder.model.Pair;
import com.ticder.model.Student;
import com.ticder.model.Trio;
import com.ticder.persistence.StudentRepository;

import java.util.*;


public class ClassRoomController
{
    StudentRepository studentRepository = StudentRepository.getInstance();

    public List<Group> pair() throws NotFoundException
    {
        List<Student> students = new ArrayList<>(studentRepository.getStudents().values());

        Group group;
        List<Group> groupList = new ArrayList<>();

        if (students.size() >= 2)
        {
            Collections.shuffle(students, new Random());

            int i = 0, j = students.size();
            while (i < j)
            {
                if (i + 3 == j)
                {
                    group = new Trio(students.get(i), students.get(i + 1), students.get(i + 2));
                    i = i + 3;
                }
                else
                {
                    group = new Pair(students.get(i), students.get(i + 1));
                    i = i + 2;
                }
                groupList.add(group);
            }
        }

        return groupList;
    }
}
