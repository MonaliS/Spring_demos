package com.monali;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//use of ApplicaationContextAware,BeanNameAware,InitializingBean,DisposableBean
public class JavaCourse implements ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean{
	private Student student1;
	private Student student2;
	ApplicationContext context;
	//xml file have Setter dependency Injection used
	public Student getStudent1() {
		return student1;
	}
	public void setStudent1(Student student1) {
		this.student1 = student1;
	}
	public Student getStudent2() {
		return student2;
	}
	public void setStudent2(Student student2) {
		this.student2 = student2;
	}
	
	public void getStudentInfo(){
		System.out.println("student1 Name:"+student1.getName()+" roll number:"+student1.getRollNo());
		System.out.println("student2 Name:"+student2.getName()+" roll number:"+student2.getRollNo());
	}
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
	}
	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name:"+beanName);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method for javacourse");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method for javacourse");
	}
	
	/*Self written init method ...acts same as InitializingBean's afterPropertiesSet
	method. configured in xml file*/
	public void myInit(){
		System.out.println("My init method");
	}
	
	/*Self written destroy method ...acts same as DisposableBean's destroy method. 
	 configured in xml file*/
	public void cleanUp(){
		System.out.println("My destroy method");
	}
}
