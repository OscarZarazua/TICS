package com.example.SpringBootNtt.controller;

import com.example.SpringBootNtt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteController {

    @Autowired
    private StudentService service;

    @GetMapping("/listaAlumnos")
    public String listaAlumnos(Model model){
        model.addAttribute("students", service.getLista());
        return "alumnos";
    }
}
