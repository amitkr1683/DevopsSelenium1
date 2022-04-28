package mavenSeleniumProject1;
import org.testng.annotations.Test; 
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromFile {
    @Test
    public void main() throws Exception {

		FileInputStream fis = new FileInputStream("./configFile/configData.properties");

		Properties pro = new Properties();
		pro.load(fis);

		System.out.println(pro.getProperty("appURL"));
		System.out.println(pro.getProperty("userName"));
		System.out.println(pro.getProperty("password"));
		System.out.println(pro.getProperty("executeOnBrowser"));

	}
}