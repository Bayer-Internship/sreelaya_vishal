package com.example.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.todo.model.ToDoModel;
import com.example.todo.repository.ToDoRepository;



@Controller
public class ToDoController {
	
	@Autowired
	private ToDoRepository todorepo;
	
	Logger logger=LoggerFactory.getLogger(ToDoController.class);
	@GetMapping("/")
	public String first(Model model) {
		logger.info("added");
		model.addAttribute("alllist",todorepo.findAll());
		return "index";
	}
	@GetMapping("/createtodo")
	public String add(Model model,ToDoModel todomodel) {
		model.addAttribute("addall", todomodel);
		return "add";
	}
	@GetMapping("/update/{id}")
	public String update(Model model,@PathVariable("id")long id) {
		System.out.println("hi");
		ToDoModel todomodel=todorepo.findById(id).orElseThrow(()-> new IllegalArgumentException("couldnot find id"));
		model.addAttribute("addall",todomodel);
		return "update";
	}
	@PostMapping("/update/{id}")
	public String update(Model model,@PathVariable("id")long id,ToDoModel todomodel){
		todorepo.save(todomodel);
		return"redirect:/";
	}
	@PostMapping("/createtodo")
	public String insert(Model model,ToDoModel todomodel) {
		todorepo.save(todomodel);
		return "redirect:/";
	}
	@GetMapping("/delete/{id}")
	public String delete(Model model,@PathVariable("id")long id ){
		
		logger.error("id not deleted");
		todorepo.deleteById(id);
		return "redirect:/";
		
		
		
	}
	
	@GetMapping("/edit/{id}")
	public String change(@PathVariable Long id) {
		
		ToDoModel m1=todorepo.findById(id).get();
		m1.setComplete(!m1.isComplete());
		todorepo.save(m1);
		return "redirect:/";
	}
	
	

}
