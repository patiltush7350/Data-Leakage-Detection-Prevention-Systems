package com.data.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
   @GetMapping("/home")
   public String home() {
	   return "home";
   }
   
   @GetMapping("/login")
   public String login() {
	   return "login";
   }
   @GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
   @GetMapping("/logs")
	public String logs() {
		return "logs";
	}
   @GetMapping("/settings")
	public String settings() {
		return "settings";
	}
   @GetMapping("/charts")
	public String charts() {
		return "charts";
	}
}
