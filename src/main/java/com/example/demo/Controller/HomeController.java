package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Model;
import com.example.demo.Repository.HomeRepository;

@RestController
public class HomeController {
	
	@Autowired
	HomeRepository or;

	@RequestMapping("/home")
	public ModelAndView gethome() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("/add")
	public ModelAndView getadddata(Model model) {
		System.out.println("We are adding");
		System.out.println(model);
		or.save(model);
		return new ModelAndView("Success");
	}
	
	@GetMapping("/get")
	public List<Model> gethome(@RequestParam("name") String name) {
	List<Model> li = or.findByname(name);
	return li;
	}
	
	@GetMapping("/getall")
	public Optional<Model> getalldata(@RequestParam("id") int id) {
		Optional<Model> li2 = or.findById(id);
		return li2;
	}
	
}
