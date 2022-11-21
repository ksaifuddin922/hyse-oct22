package myjavaprogs;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("Default Constructor");
	}

	public ConstructorDemo(String name) {
		System.out.println("Param String");
	}

	public ConstructorDemo(int a) {
		System.out.println("param Int");
	}

	public ConstructorDemo(int a, String b) {
		System.out.println("2 param int and string");

	}
	
	public static void main(String[] args) {
		ConstructorDemo obj1= new ConstructorDemo(10,"asdvadvasdkk");
		
		
	}

}
