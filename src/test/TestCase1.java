package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestCase1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fs= new FileInputStream("C:\\versionControl\\LearningProject\\src\\PropertyFiles\\object.properties");
		prop.load(fs);
		System.out.println(prop.getProperty("age"));
		
	}

}
