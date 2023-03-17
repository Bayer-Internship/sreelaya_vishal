package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.seedRepo;
import com.example.demo.model.seed;

@Controller
public class SeedController {
	@Autowired
	seedRepo repo;
	@RequestMapping("/home1")
	public String home() {
		return "home1.jsp";
	}
	@RequestMapping("/addSeed")
	public String addSeed(seed Seed) {
		repo.save(Seed);
		return "home.jsp";
	}

}
