package com.pand.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConditionConfig.class);
		
		ListService listService = context.getBean(ListService.class);
		
		System.out.println("当前系统下的显示目录命令为:"+listService.showListCmd());
	}
}
