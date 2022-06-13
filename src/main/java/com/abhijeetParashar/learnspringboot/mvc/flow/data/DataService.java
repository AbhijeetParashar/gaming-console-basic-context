package com.abhijeetParashar.learnspringboot.mvc.flow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService{
	public List<Integer> retrieveData(){
		return Arrays.asList(12,34,50,74,56);
	}
}
