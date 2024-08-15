package com.keetha.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.keetha.beans.WishMessageGenerator;

public class Test {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src/com/keetha/cfgs/spring.xml");
		
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		WishMessageGenerator obj=(WishMessageGenerator) factory.getBean("wmg");
	String res1=obj.wishMessageGenerator("Kalyan");
	
	System.out.println(res1);
		
	}
}
