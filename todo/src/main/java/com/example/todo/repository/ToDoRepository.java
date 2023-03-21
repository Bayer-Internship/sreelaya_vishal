package com.example.todo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.model.ToDoModel;
@Repository
public interface ToDoRepository extends JpaRepository<ToDoModel, Long> {
	 Optional<ToDoModel> findById(Long id);

}
