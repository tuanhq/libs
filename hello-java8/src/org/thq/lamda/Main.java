package org.thq.lamda;

public class Main {
	public static void main(String[] args) {

		MathOperation sub = (int a, int b) -> {
			return a - b;
		};
		MathOperation add = (int a, int b) -> a - b;
		MathOperation mult = (a, b) -> a * b;
		
		
		GreetingService greetingService = (String message) -> {
			System.out.println("Hello" + message);
		};
		GreetingService greetingService2 = message -> System.err.println(message);
		;

	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
