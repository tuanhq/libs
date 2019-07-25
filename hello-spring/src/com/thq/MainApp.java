package com.thq;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[] args) {
		loadBean4();
	}
	public static void loadBean1() {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      context.registerShutdownHook();
	}
	public static void loadBean2() {
		XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml")); 
	    HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");    
	    obj.getMessage();  
	    
	}
	//load anotion
	public static void loadBean3() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("BeansAno.xml");
	      
	      Student student = (Student) context.getBean("student");
	      System.out.println("Name : " + student.getName() );
	      System.out.println("Age : " + student.getAge() );
	}
	//load anotion2 without xml
	public static void loadBean4() {
		ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		   
		      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		      helloWorld.setMessage("Hello World!");
		      helloWorld.getMessage();
	}

}
