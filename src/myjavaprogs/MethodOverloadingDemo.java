package myjavaprogs;

public class MethodOverloadingDemo {

	public void add() {

		System.out.println("method with no param");
	}

	public void add(int a) {

		System.out.println("method with 1 int param");
	}

	public void add(int a, int b) {

		System.out.println("method with 2 int param");
	}

	public void add(int a, double b) {

		System.out.println("method with 1 int 1 double param");
	}

	public void add(String name) {

		System.out.println("method with String param");
	}

	public static void main(String[] args) {
		MethodOverloadingDemo obj1 = new MethodOverloadingDemo();
		obj1.add(10, 12.12);
		
	}
	public static void main(String args) {
		
	}
}
