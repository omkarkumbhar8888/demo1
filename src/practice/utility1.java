package practice;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class utility1 {
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\con1.properties";

		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String a = prop.getProperty("username");
		System.out.println(a);
	}
}
