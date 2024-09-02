package samplePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import generic.IconstantUtility;

public class SampleProperties_HardCode {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(IconstantUtility.PropertiesPath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String URL = pobj.getProperty("url");
		String UNAME = pobj.getProperty("username");
		String PASS = pobj.getProperty("password");
		System.out.println(URL);
		System.out.println(UNAME);
		System.out.println(PASS);	 
	}

}
