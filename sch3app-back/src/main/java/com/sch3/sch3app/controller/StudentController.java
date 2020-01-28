package com.sch3.sch3app.controller;

import com.sch3.sch3app.entity.Sch302StudentEntity;
import com.sch3.sch3app.service.IStudentService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private IStudentService studentService;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

//    @RequestMapping("/")
//    public String viewHomePage(Model model) {
//        List<Sch302StudentEntity> studentEntities = studentService.getAll();
//        model.addAttribute("studentEntities", studentEntities);
//
//        return "index";
//    }

    @RequestMapping("/students")
    public List<Sch302StudentEntity> viewStudents(Model model) {
        List<Sch302StudentEntity> studentEntities = studentService.getAll();
        return studentEntities;
    }
}
