package myjavaprogs;

public class StsticDemo {

	static int age = 18;

	static String name = "Test";

	public static void method1() {
		System.out.println(" M1");
	}

	public void method2() {
		System.out.println(" M2");
	}

	public static void main(String[] args) {

		System.out.println(age);

		method1();

		StsticDemo obj1 = new StsticDemo();
		System.out.println(obj1.name);
		obj1.method2();
		String name = "";
	}

}
