package com.example.todo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.todo.model.ToDoModel;
import com.example.todo.repository.ToDoRepository;

@Component
public class ToDoConfig implements CommandLineRunner {
	@Autowired
	private ToDoRepository todorepo;
	public void run(String...args)throws Exception {
		loaddata();
		
	}
	private void loaddata() {
		// TODO Auto-generated method stub
		if(todorepo.count()==0) {
			ToDoModel todomodel=new ToDoModel("drink water");
			todorepo.save(todomodel);
		}
	}
	

}
