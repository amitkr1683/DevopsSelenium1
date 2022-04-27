package mavenSeleniumProject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromFile {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("./configFile/configData.properties");

		Properties pro = new Properties();
		pro.load(fis);

		System.out.println(pro.getProperty("appURL"));
		System.out.println(pro.getProperty("userName"));
		System.out.println(pro.getProperty("password"));
		System.out.println(pro.getProperty("executeOnBrowser"));

	}
}