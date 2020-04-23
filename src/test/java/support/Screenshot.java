package support;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Screenshot {

	    public static void tirar (AndroidDriver<MobileElement> mobileDriver, String arquivo){
	        File screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
	        try{
	           FileUtils.copyFile(screenshot, new File(arquivo));
	        } catch (Exception e) {
	            System.out.println("Houveram problemas ao copiar o arquvivo para a pasta");
	        }
	}

}
