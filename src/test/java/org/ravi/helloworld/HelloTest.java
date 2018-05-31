package org.ravi.helloworld;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HelloTest {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/training_c2a.05.01/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoaut.com");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
	}

	@Test
	public void f() {

		String text1 = driver.findElement(By.xpath("//tr[@align = 'right']/td[@colspan = '2']/font[@size = '2' and @face = 'Arial, Helvetica, sans-serif, Verdana']/b")).getText();
		System.out.println("The date is: "+text1);
		driver.findElement(By.name("userName")).sendKeys("vishnu");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		String text = driver.findElement(By.name("userName")).getAttribute("value");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		System.out.println("The Username entered is: "+text);

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}


}
