package com.pand.highlight_spring4.ch2.prepost;

public class BeanWayService {

	public BeanWayService() {
		super();
		System.out.println("BeanWayService()");
	}
	
	public void init() {
		System.out.println("init()");
	}
	
	public void destroy() {
		System.out.println("destroy()");
	}
}
