package com.abhijeetParashar.learnspringboot.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("UP");
	}
	
	public void down() {
		System.out.println("DOWN");
	}
	
	public void right() {
		System.out.println("Right");
	}
	
	public void left() {
		System.out.println("LEFT");
	}

}
