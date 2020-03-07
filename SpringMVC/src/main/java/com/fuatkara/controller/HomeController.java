package com.fuatkara.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/info") 
			//Eskiden Path kullanirdik fakat,Spring de RequestMapping kullaniyoruz
		  //Pathin RequestMappingle ayni fakat spring tarafinda bunu kullaniyoruz.

public class HomeController {
	@RequestMapping(value = "/detail/{id}/{name}/{surname}", method = RequestMethod.GET)
	//http://localhost:8080/SpringMVC/info/detail/1/Fuat/Kara
	public String home(
			@PathVariable("id") int id,
			@PathVariable("name") String name,
			@PathVariable("surname") String surname,
			Model model
			) {
		//PathParam yapiyorduk fakat burda Sping icin herhalde PathVariable diyoruz.
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		model.addAttribute("surname", surname);
		return "home";
	}
}

