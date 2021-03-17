package com.codeboard.codeboardaws.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PersonController {
	@RequestMapping("/getname")
 public String getName() {
	 return "Gaurav";
 }
}
