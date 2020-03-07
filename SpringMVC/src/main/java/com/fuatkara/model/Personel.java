package com.fuatkara.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect   //Biz bunu json donusturcez, PersonelController'da json istedik applicationi
public class Personel {
	//super() => javada  public class Personel extends Object {} 
	//java butun classlarinin ustunde duran bi objec isimliclass  
	//Super()'i Bulunsada olur, silinsede olur.
	int id;
	String name;
	
	public Personel() {
		this.id = 1;
		this.name = "Personel Name";
	}

	public Personel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Personel id= " + id +
				"Name= " + name;
	}

		
	
	
	
}