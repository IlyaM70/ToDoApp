package com.ilya.todoapp.controller;

import com.ilya.todoapp.repositories.ToDoListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ToDoAppController {

    @Autowired
    private ToDoListRepo toDoListRepo;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index.html");
        modelAndView.addObject("toDoList",toDoListRepo.findAll());
        return modelAndView;
    }
}
