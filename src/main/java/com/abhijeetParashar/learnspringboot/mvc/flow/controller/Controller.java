package com.abhijeetParashar.learnspringboot.mvc.flow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhijeetParashar.learnspringboot.mvc.flow.service.BussinessService;

@RestController
public class Controller {
	
	@Autowired
	private BussinessService bussinessService;
	@GetMapping("/sum")
	public long displaySum() {
		return bussinessService.calculateSum();
	}
}