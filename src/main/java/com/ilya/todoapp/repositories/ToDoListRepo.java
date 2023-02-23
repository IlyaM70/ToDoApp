package com.ilya.todoapp.repositories;


import com.ilya.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoListRepo extends JpaRepository<Task,Long> {

}
