package com.pand.highlight_spring4.ch1.javaconfig;

//此处没有使用@Service声明Bean
public class UseFunctionService {
	
	//此处没有使用@Resource注入Bean
	FunctionService functionService;
	
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
