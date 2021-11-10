package com.example.SpringBootNtt.controller;

import com.example.SpringBootNtt.entity.Student;
import com.example.SpringBootNtt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentCortoller {

    @Autowired
    private StudentService service;


    @GetMapping("/{nombre}")
    public String holaMundo(@PathVariable String nombre) {
        return "Hola Mundo " + nombre;
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        service.addStudent(student);
    }

    @GetMapping("/porNombre/{nombreVariable}")
    public Student getStudentByName(@PathVariable("nombreVariable") String name) {
        return service.getStudent(name);
    }

    @GetMapping("/homepage")
    public String homepage(Model model){
        model.addAttribute("yoSoy", "Oscar");
        return "home";
    }
}
