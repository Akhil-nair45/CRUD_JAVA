package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Model2;
import com.example.demo.Repository.MovieRepo;

@RestController
public class MovieController {

	@Autowired
	MovieRepo or2;
	
	@RequestMapping("/AddMovies")
	public ModelAndView getadd() {
		return new ModelAndView ("AddMovies");
	}
	
	@RequestMapping("/addmovies")
	public ModelAndView getaddmovies(Model2 model) {
		System.out.println("added movie");
		or2.save(model);
		return new ModelAndView("Success");
	}
	
	@RequestMapping("/getmovies")
	public List<Model2> getmovies(@RequestParam("language") String language) {
		List<Model2> li = or2.findBylanguage(language);
		return li;
	}
}

