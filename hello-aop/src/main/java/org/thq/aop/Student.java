package org.thq.aop;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	   private Integer age;
	   private String name;
	   @Value("11")
	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      System.out.println("Age : " + age );
	      return age;
	   }
	   @Value("Zaha")
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      System.out.println("Name : " + name );
	      return name;
	   }
	   
	   public void printThrowException(){
	      System.out.println("Exception raised");
	      throw new IllegalArgumentException();
	   }
	}
