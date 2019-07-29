package com.agree.Astudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
public class AstudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AstudyApplication.class, args);
	}
	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		return "Hello SpringBoot";
	}
}
