package testDataDriven;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class UseOfProprtyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Eclipse Programs\\Automation51\\testdata\\Propertydata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String proprtyurl=prop.getProperty("url");
		System.out.println( proprtyurl);
		String propemail=prop.getProperty("email");
		System.out.println(propemail);
		

	}

}
