package co.simplon.hote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class siteController {
	
	@RequestMapping(value = {"/","/index"})
	public String index(Model model) {
		model.addAttribute("name", "jean-luc");
		return "index";
	}
	
	@RequestMapping("/region")
	public String region(Model model) {
		return "maregion";
	}
	
	@RequestMapping("/reservation")
	public String reservation(Model model) {
		return "reservation";
	}
	
	

}
