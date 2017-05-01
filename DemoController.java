package com.bimal.example;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

	 @RequestMapping("/hi")
	 public @ResponseBody String hiThere(){
	 return "This is test";
	 }

//	@RequestMapping("/hi/{name}")
//	public String useTymeleaf(Map<String, String> model, @PathVariable String name) {
//		model.put("name", name);
//		return "hello1";
//	}

//	@RequestMapping("/team")
//	public  Team useRESTConverter() {
//		return team;
//	}
	 
		@Autowired
		TeamDao teamDao;
	 @RequestMapping("/teams")
	 public Iterable<Team> getTeams(){
		return teamDao.findAll() ;
	 }
	 @RequestMapping("/team/{name}")
	 public Team getTeamByname(@PathVariable String name){
		return teamDao.findByName(name) ;
	 }
}
