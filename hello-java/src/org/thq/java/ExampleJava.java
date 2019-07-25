package org.thq.java;

import java.util.function.Consumer;

public class ExampleJava {
	public static void main(String[] args) {
		Dog dog = new Dog("milu");
		exchangeObj(dog);
		System.out.println(dog.getName());
		exchangeObj2(dog);
		Dog dog2 = new Dog("milu2");		
		Consumer<Dog> test = d -> d.setName("test");
		test.accept(dog2);
		System.out.println(dog2.getName());
		
	}
	public static void exchangeObj(Dog dog) {
		dog.setName("milu change");
	}
	public static void exchangeObj2(Dog dog) {
		dog = new Dog("milu change2");
	}

}
class Dog{
	private String name;
	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

