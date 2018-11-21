package com.ticder;

import com.ticder.controller.ClassRoomController;
import com.ticder.controller.StudentController;
import com.ticder.exception.NameRequiredException;
import com.ticder.exception.NotFoundException;
import com.ticder.model.Group;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class TicderController
{
    StudentController studentController = new StudentController();
    ClassRoomController classRoomController = new ClassRoomController();

    @PostMapping("/afegirAlumne")
    public void createPlayer(@RequestParam String name) throws NameRequiredException {
        studentController.createStudent(name);
    }

    @DeleteMapping("/esborrarAlumne")
    public void deleteStudent(@RequestParam int id) throws NotFoundException {
        studentController.deleteStudent(id);
    }

    @GetMapping("/aparellar")
    public List<Group> pair() throws NotFoundException{
        return classRoomController.pair();
    }
}