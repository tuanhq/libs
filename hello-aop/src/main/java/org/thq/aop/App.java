package org.thq.aop;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = 
    	         new AnnotationConfigApplicationContext(ApplicationConfig.class);

    	      Student student = (Student)context.getBean("student");

    	      student.getName();
    	      student.getAge();
    	      
    	      student.printThrowException();
    	      
    	      
//    	      ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//    	      
//    	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
//    	      helloWorld.setMessage("Hello World!");
//    	      helloWorld.getMessage();
    }
}
