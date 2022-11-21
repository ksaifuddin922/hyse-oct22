package myjavaprogs;

public class StringsDemo {
	public static void main(String[] args) {

		String str1 = "Automation Testing";

		String str2 = "fadkhfgADKFGADKFG";
		String str3 = "Automation Testing";

		System.out.println(str1 + str2);

		System.out.println(str1.concat(str2));

		System.out.println(str2.length());

		System.out.println(str1.charAt(5));

		System.out.println(str1.equals(str3));

		System.out.println(str1.contains(str2));

		System.out.println(str1.toUpperCase());

	}
}
