package myjavaprogs;

public class ClassB {

	public static void main(String[] args) {
		ClassA obj1 = new ClassA();
		obj1.AddTwoNumbers();
		int z=obj1.AddTwoNumbersWithparam(50, 60);
		
		int xy=100;
		System.out.println(z+xy);
		
		
	}

}
