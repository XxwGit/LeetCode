package com.agree.Astudy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agree.Astudy.entity.User;

@RestController
public class GetUser {
	@RequestMapping(value = "{name}")
	public User getUser(@PathVariable String name) {
		User user = new User();
		user.setUserName(name);
		user.setPassword("123456");
		System.gc();
		return user;
	}
	@RequestMapping("/getMap")
	public Map<String, String> getMap(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "xxw");
		map.put("2", "xxw");
		map.put("3", "xxw");
		map.put("4", "xxw");
		return map;
	}
}	
