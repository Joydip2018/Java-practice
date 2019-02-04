package basic_prog;

import java.io.File;

public class file_heandeling {

	public static void main(String[] args) 
	{
		File tmpDir = new File(".//src//main//java//Testpack//stringtest.java");
	    boolean exists = tmpDir.exists();
	    System.out.println("\n"+exists);
	}

}
