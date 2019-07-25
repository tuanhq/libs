package org.thq.method;

public interface MyInterface {
	default void hello() {
		System.out.println("Hello");
	}
	default void hello2() {
		System.out.println("Hello 2");
	}
	static void staticHello() {
		System.out.println("Static hello");
	}
	static void staticHello2() {
		System.out.println("Static hello");
	}

}
