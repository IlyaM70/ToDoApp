package com.ilya.todoapp.config;

import com.ilya.todoapp.models.Task;
import com.ilya.todoapp.repositories.ToDoListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskDataLoader implements CommandLineRunner {

    @Autowired
    ToDoListRepo toDoListRepo;

    @Override
    public void run(String...args) throws Exception{
        loadSeedData();
    }

    private void loadSeedData(){
        if(toDoListRepo.count()==0){
            Task task1 = new Task("Do homework");
            Task task2 = new Task("Exercise");

            toDoListRepo.save(task1);
            toDoListRepo.save(task2);
        }
    }

}
