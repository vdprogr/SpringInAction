package com.vdprog.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vdprog/spring/context.xml");

		Performer performer = (Performer) ctx.getBean("poeticduke");
		performer.perform();

		
	}

}
