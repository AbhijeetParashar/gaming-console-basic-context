package com.abhijeetParashar.learnspringboot.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole {
	public void up() {
		System.out.println("PacMan UP");
	}
	public void down() {
		System.out.println("PacMan Down");
	}
	public void right() {
		System.out.println("PacMan Right");
	}
	public void left() {
		System.out.println("PacMan Left");
	}
}
