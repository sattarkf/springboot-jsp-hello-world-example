package com.sattarkf.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Controller public class HelloController {
 * 
 * 
 * @GetMapping({"/", "/hello"}) public String hello(@RequestParam (value =
 * "name", defaultValue = "World", required = true) String name, Model model) {
 * model.addAttribute("name", name); return "hello";
 * 
 * }
 * 
 * 
 * 
 * }
 */

@RestController
public class HelloController {
 
	@RequestMapping("/hello")
	public String index() {
		return "Spring Boot Example!!";
	}
 
}