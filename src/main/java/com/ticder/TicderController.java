package com.ticder;

import org.springframework.web.bind.annotation.*;


@RestController
public class TicderController
{
    StudentController studentController = new StudentController();
    ClassRoomController classRoomController = new ClassRoomController();

    @RequestMapping(value = "/afegirAlumne", method = RequestMethod.POST)
    public String createPlayer(@RequestParam("name") String name) throws NameRequiredException, NameAlreadyExistsException
    {
        return "Student: " + studentController.createStudent(name) + " created.";
    }

    @RequestMapping(value = "/esborrarAlumne", method = RequestMethod.DELETE)
    public String deleteStudent(@RequestParam("id") Integer id) throws NotFoundException
    {
        studentController.deleteStudent(id);

        return "Student with id: " + id + " has been deleted.";
    }

    @RequestMapping(value = "/aparellar", method = RequestMethod.GET)
    public String pair()
    {
        classRoomController.pair();

        return "";
    }
}