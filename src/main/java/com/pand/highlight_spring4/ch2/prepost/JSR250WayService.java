package com.pand.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	public JSR250WayService() {
		super();
		System.out.println("JSR250WayService()");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy()");
	}
}
