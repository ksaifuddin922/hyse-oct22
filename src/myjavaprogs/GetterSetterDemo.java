package myjavaprogs;

public class GetterSetterDemo {

	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		GetterSetterDemo demoobj = new GetterSetterDemo();
		demoobj.setName("kapil");
		String name = demoobj.getName();
		System.out.println(name);
		GetterSetterDemo demoob1 = new GetterSetterDemo();
		demoob1.setName("Mahesh");
		String name1 = demoob1.getName();
		System.out.println(name1);
	}

}
