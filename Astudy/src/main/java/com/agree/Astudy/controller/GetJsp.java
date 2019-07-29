package com.agree.Astudy.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetJsp {
	@GetMapping("/getJsp")
	public String GetJsp(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("name", "ÐìÐÂÎ°");
		return "getjsp";
	}
}
