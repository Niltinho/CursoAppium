package tests;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTeste {

	
	private AndroidDriver<MobileElement> driver;
	
	
	@Before
	public void setUp() throws MalformedURLException {
	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	
	desiredCapabilities.setCapability("platformName", "Android");
	desiredCapabilities.setCapability("deviceName", "emulator-5554");
	desiredCapabilities.setCapability("automationName", "uiautomator2");
	desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
	desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	
	}
	
	@Test
	public void deveSomarDoisValores () {
		driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
		driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
		driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
		driver.findElement(By.id("com.android.calculator2:id/result")).click();
		
		String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
		
		//System.out.println(result);
		assertEquals("4", result);
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
