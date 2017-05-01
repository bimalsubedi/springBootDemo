package com.bimal.example;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * @author bimal
 *
 */
@SpringBootApplication
public class SpringbootdemoApplication extends SpringBootServletInitializer {


	/**
	 * This method is used when ran as JAR
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
	private Team team;
	
	@PostConstruct
	public void init(){
		Player player = new Player("Neymar","Stricker");
		Set<Player> players = new HashSet<>();
		players.add(player);
		players.add(new Player("Messi","Stricker"));
		 team = new Team("Barcelona","Barcelona",players);
		 teamDao.save(team);
	}
	
	@Autowired
	TeamDao teamDao;
	
	/**
	 * This method is used when ran as WAR
	 */
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(SpringbootdemoApplication.class);
//	}
	
}
