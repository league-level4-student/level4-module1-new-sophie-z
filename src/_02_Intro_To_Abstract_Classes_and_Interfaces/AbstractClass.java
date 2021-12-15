package _02_Intro_To_Abstract_Classes_and_Interfaces;

public abstract class AbstractClass {
	String string;
	public abstract void method1();		
	public abstract void method2();
	public void method3() {
		System.out.println("method3");
	}
	double interDemo() {
		return 0.1;
	}
	String faceDemo() {
		return "string";
	}
}
