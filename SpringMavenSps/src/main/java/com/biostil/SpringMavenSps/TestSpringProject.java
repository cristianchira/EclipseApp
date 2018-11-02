package com.biostil.SpringMavenSps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.prepareHotDrink();
		String[] str = { "rr", "rr", "jhhk" };
		List<String> ls = Arrays.asList(str);
		List<String> u = ls.stream().distinct().collect(Collectors.toList());
		System.out.println(u);
	}

}
