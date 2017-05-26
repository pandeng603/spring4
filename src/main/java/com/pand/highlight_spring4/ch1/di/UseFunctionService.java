package com.pand.highlight_spring4.ch1.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	@Resource
	FunctionService functionService;
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
