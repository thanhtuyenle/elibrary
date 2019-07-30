package edu.mum.cs.cs425.demowebapps.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {
		@GetMapping(value = {"/", "/elibrary", "/elibrary/home"})
		public String displayHomePage() {
			return "home/index";
		}
}
