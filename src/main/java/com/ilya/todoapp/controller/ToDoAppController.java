package com.ilya.todoapp.controller;

import com.ilya.todoapp.models.Task;
import com.ilya.todoapp.repositories.ToDoListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ToDoAppController {

    @Autowired
    private ToDoListRepo toDoListRepo;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index.html");
        modelAndView.addObject("toDoList",toDoListRepo.findAll());
        return modelAndView;
    }

    @GetMapping("/create-task")
    public String showCreateForm(Task task){
        return "add-task";
    }

    @PostMapping("/task")
    public String createTask(@Valid Task task, BindingResult result, Model model ){
        if (result.hasErrors()){
            return "add-task";
        }
        task.setIsDone(false);
        toDoListRepo.save(task);
        return "redirect:/";
    }


    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") long id, Model model){
        Task task = toDoListRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Task id: "+id+" not found"));

        model.addAttribute("task",task);
        return "edit-task";
    }


    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable("id") long id, Model model){
        Task task = toDoListRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Task id: "+id+" not found"));

        toDoListRepo.delete(task);
        return "redirect:/";
    }


    @PostMapping("/task/{id}")
    public String updateTask(@PathVariable("id") long id, @Valid Task task, BindingResult result, Model model ){
        if (result.hasErrors()){
            task.setId(id);
            return "edit-task";
        }

        toDoListRepo.save(task);
        return "redirect:/";
    }


}
