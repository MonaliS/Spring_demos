package com.monali.serviceImpl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String []args0){
		Resource res=new ClassPathResource("config1.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Resource res1=new ClassPathResource("config2.xml");
		BeanFactory factory1=new XmlBeanFactory(res1,factory);
		Travel t=(Travel) factory1.getBean("travel");
		t.startJourney();
	}
}
