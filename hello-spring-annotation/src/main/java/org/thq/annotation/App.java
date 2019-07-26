package org.thq.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.thq.annotation.business.MyClazz;
import org.thq.annotation.business.MyInterface;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    	//MyInterface myInterface = (MyInterface) ctx.getBean("abc") ;
//    	MyClazz myClazz = ctx.getBean(MyClazz.class);
//    	myClazz.toDo();
    	
    	String[] beanNames = ctx.getBeanDefinitionNames();

         for (String beanName : beanNames) {
        	 System.out.println("*****");
             System.out.println("NAME:"+ beanName );
             System.out.println("Class: " + ctx.getBean(beanName).getClass().toString());
             System.out.println("*****");
             
         }
    	

    }
}
