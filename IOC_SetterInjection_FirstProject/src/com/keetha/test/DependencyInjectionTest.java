package com.keetha.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.keetha.beans.Person;
import com.keetha.beans.Person1;

public class DependencyInjectionTest {

	
	public static void main(String[] args) {
		
		XmlBeanFactory factory =new  XmlBeanFactory(new FileSystemResource("src/com/keetha/cfgs/setterInjection.xml"));
		Person p =(Person) factory.getBean("per");
		System.out.println(p);
		
		System.out.println("-----------");
		Person1 p1 =(Person1) factory.getBean("per1");
		System.out.println(p1);
	}
}
