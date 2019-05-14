package com.cg.model;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesEx {
	static Properties prop = new Properties();
	public static void readProperties() {
		
		try {
			InputStream is = new FileInputStream(
					"C:\\Users\\madam\\eclipse-workspace\\Module4\\Module4\\src\\main\\java\\config.properties");
			prop.load(is);
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
