package com.fuatkara.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fuatkara.model.Personel;

@Controller
@RequestMapping("/personal")
public class PersonelController {
	//Bi tane personel yollayacaksan 
		//public Personel name{}
	//Birden fazlaysa 
		//public List<Personel> name{}   , Set<Personel> de yolayabilirdin bunlarin
		//gruplari da var.
	
	static Set<Personel> personels;
	
	static {
		personels = new HashSet<Personel>();
		
		Personel personal = null;
		
		for (int i = 1; i < 10; i++) {
			personal = new Personel(i, " Personal_" + i); // Burda cikti "1 Personel_1" , "2 Personal_2" diye gitcek.
			personels.add(personal);
		}
	}
	
	//http://localhost:8080/SpringMVC/personal/toList

	//	@RequestMapping("/toList")
	//	public Set<Personel> name() { 		Boyle yazarsan olmaz, Asagidaki gibi method. yaz!!
	//		return personels;				Value yazmaya unutma cunku personel maping icinde birden fazla value var
	//	}
	@RequestMapping(value = "/toList", method = RequestMethod.GET, headers="Accept = application/json", produces = "application/json")
	@ResponseBody
	public Set<Personel> name() {
		return personels;
	}
}