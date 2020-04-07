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

public class CalculadoraSamsungTeste {

	
	private AndroidDriver<MobileElement> driver;
	
	
	@Before
	public void setUp() throws MalformedURLException {
	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	
	desiredCapabilities.setCapability("platformName", "Android");
	desiredCapabilities.setCapability("deviceName", "1b736d6d");
	desiredCapabilities.setCapability("automationName", "uiautomator2");
	desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	desiredCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
	
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	
	}
	
	@Test
	public void deveSomarDoisValores () {
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult")).click();
		
		String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult")).getText();
		
		//System.out.println(result);
		assertEquals("4", result);
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
