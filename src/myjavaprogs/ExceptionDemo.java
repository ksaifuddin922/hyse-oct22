package myjavaprogs;

import java.io.File;
import java.io.FileInputStream;


public class ExceptionDemo {

	public void testExp() {
		try {
			File newFile= new File("abc.txt");
			
			FileInputStream fis=new FileInputStream(newFile);
			
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
		

}
