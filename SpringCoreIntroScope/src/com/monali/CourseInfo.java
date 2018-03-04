package com.monali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseInfo {
	public static void main(String[]args){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		JavaCourse javaCourse=(JavaCourse) context.getBean("javaCourse-alias");;
		javaCourse.getStudentInfo();
	}
}
