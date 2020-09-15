package com.hasi.HelloRest.Appliction;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(path = "/hello")
	public String GetHello(Model model) {
		Data data=new Data("hi", "27");
		model.addAttribute("data",data);
		return "/hello/data";
	}

	//data Ãß°¡
	class Data{
		String name;
		String age;
		public Data(String name, String age) {
			super();
			this.name = name;
			this.age = age;
		}
		

	}
}
