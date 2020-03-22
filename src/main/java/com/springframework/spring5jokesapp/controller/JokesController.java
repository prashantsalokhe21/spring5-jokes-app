package com.springframework.spring5jokesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.spring5jokesapp.services.JokeService;

@Controller
@RequestMapping(value= {"/",""})
public class JokesController {

	@Autowired
	private JokeService jokeService;
	
	@GetMapping
	public String getJoke(Model model) {
		String joke = jokeService.getJoke();
		System.out.println(joke);
		model.addAttribute("joke", joke);
		return "chucknorris";
	}
}
