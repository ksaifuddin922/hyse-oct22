package myjavaprogs;

public class ClassChild extends ClassBase {

	public void method1(int a) {
		System.out.println("This is methods 1 of Child class" + a);
	}
	

	public static void main(String[] args) {
		ClassChild obj1 = new ClassChild();
		obj1.method3();
	}
}
