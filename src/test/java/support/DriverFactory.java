package support;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> getDriver(){
		if(driver == null) {
			createDriver();
		}
		return driver;
	}
	
	private static void createDriver() {
	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	
	desiredCapabilities.setCapability("platformName", "Android");
	desiredCapabilities.setCapability("deviceName", "emulator-5554");
	desiredCapabilities.setCapability("automationName", "uiautomator2");
	desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:" + File.separator + "Users" + File.separator + "318032" + File.separator + "eclipse-workspace" + File.separator + "CursoAppium" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "CTAppium.apk");
	
	try {
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
