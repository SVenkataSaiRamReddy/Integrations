package com.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	private WebDriver driver;
	SoftAssert soft = new SoftAssert();

	@Test
	public void testEasy() {
		System.setProperty("webdriver.chrome.driver", "A:\\SELENIUM\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		soft.assertEquals("FB Login", title);
		driver.quit();
	}
}

