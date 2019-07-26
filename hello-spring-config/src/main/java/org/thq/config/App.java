package org.thq.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.thq.config.component.TestLoadConfig;
import org.thq.config.service.MyInterface;
import org.thq.config.service.MyTestConfigClazz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    	
//    	MyTestConfigClazz mytest = ctx.getBean(MyTestConfigClazz.class);
//    	mytest.toDo();
//    	MyInterface myInterface = ctx.getBean(MyInterface.class);
//    	myInterface.toDo();
    	TestLoadConfig testLoadConfig = ctx.getBean(TestLoadConfig.class);
    	testLoadConfig.toDo();
    	
    	//String[] beanNames = ctx.getBeanDefinitionNames();

//        for (String beanName : beanNames) {
//       	 System.out.println("*****");
//            System.out.println("NAME:"+ beanName );
//            System.out.println("Class: " + ctx.getBean(beanName).getClass().toString());
//            System.out.println("*****");
//            
//        }
    }
}
