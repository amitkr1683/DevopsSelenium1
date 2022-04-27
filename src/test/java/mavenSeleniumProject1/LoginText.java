package mavenSeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LoginText extends BaseTest {

	@Test
	public void testcase1() throws Exception {

		// locator
		// driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		// driver.findElement(By.name("Submit")).click();

		// Action -getText
		// String actualErrorMessage =
		// driver.findElement(By.id("spanMessage")).getText();
		// System.out.println("Error Message:" + actualErrorMessage);

		// String expectedErrorMessage = "Password cannot be emplty";

		driver.manage().window().setSize(new Dimension(1382, 744));
		driver.findElement(By.id("txtUsername")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Logout")).click();

		// Validation step
		// Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

	}

}