package com.abhijeetParashar.learnspringboot.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("JUMP");
	}
	
	@Override
	public void down() {
		System.out.println("DUCK");
	}
	
	@Override
	public void right() {
		System.out.println("FAST");
	}
	
	@Override
	public void left() {
		System.out.println("STOP");
	}

}
