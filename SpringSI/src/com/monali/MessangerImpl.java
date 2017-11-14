package com.monali;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MessangerImpl {
		 
		public static void main(String []args){
			Resource res=new ClassPathResource("SetterInjector.xml");
			BeanFactory factory=new XmlBeanFactory(res);
			HelloWorld helloWorld=(HelloWorld) factory.getBean("helloworld");
			System.out.println(helloWorld.getMessage());
		}
}
