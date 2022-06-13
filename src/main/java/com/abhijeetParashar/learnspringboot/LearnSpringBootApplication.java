package com.abhijeetParashar.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhijeetParashar.learnspringboot.game.GameRunner;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringBootApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
