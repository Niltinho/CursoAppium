package support;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {
	
	public void escreverCampo(By by, String nome) {
		DriverFactory.getDriver().findElement(by).sendKeys(nome);
	}
	
	public void escreverCampoPorTexto(String texto, String nome) {
		DriverFactory.getDriver().findElement(By.xpath("//*[@text='" + texto +"']")).sendKeys(nome);
	}
	
	public String obterTexto(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}
	
	public void clicar(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarPorTexto(String texto) {
		clicar(By.xpath("//*[@text='" + texto +"']"));
	}
	
	public void selecionarCombo(By by, String valor) {
		DriverFactory.getDriver().findElement(by).click();
		clicarPorTexto(valor);
	}
	
	public boolean isCheckMarcado(By by) {
		return DriverFactory.getDriver().findElement(by).getAttribute("checked").equalsIgnoreCase("true");
	}
	
	public boolean existeElementoPorTexto(String texto) {
		List<MobileElement> elementos = DriverFactory.getDriver().findElements(By.xpath("//*[@text='"+ texto +"']"));
		return elementos.size() > 0;
	}
	
	public void tap(int x, int y) {
		new TouchAction<>(DriverFactory.getDriver()).tap(PointOption.point(x, y)).waitAction().perform();
	}
	public void aguardarElementoPorTexto(String texto) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='"+ texto +"']")));
	}
	
	public void scroll(double inicio, double fim) {
		Dimension size = DriverFactory.getDriver().manage().window().getSize();
		
		int x = size.width / 2;
		
		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);
		
		new TouchAction<>(DriverFactory.getDriver())
			.press(PointOption.point(x, start_y))
			.waitAction()
			.moveTo(PointOption.point(x, end_y))
			.release()
			.perform();
	}
	
	public void scrollElement(WebElement element, double inicio, double fim) {
		int x = element.getLocation().x + (element.getSize().width / 2);
		
		int start_y = (int) (element.getSize().height * inicio);
		int end_y = (int) (element.getSize().height * fim);
		
		new TouchAction<>(DriverFactory.getDriver())
			.press(PointOption.point(x, start_y))
			.waitAction()
			.moveTo(PointOption.point(x, end_y))
			.release()
			.perform();
	}
	
	public void swipe(double inicio, double fim) {
		Dimension size = DriverFactory.getDriver().manage().window().getSize();
		
		int y = size.height / 2;
		
		int start_x = (int) (size.width * inicio);
		int end_x = (int) (size.width * fim);
		
		new TouchAction<>(DriverFactory.getDriver())
			.press(PointOption.point(start_x, y))
			.waitAction()
			.moveTo(PointOption.point(end_x, y))
			.release()
			.perform();
	}
	
	public void swipeElement(WebElement element, double inicio, double fim) {
		int y = element.getLocation().y + (element.getSize().height / 2);
		
		int start_x = (int) (element.getSize().width * inicio);
		int end_x = (int) (element.getSize().width * fim);
		
		new TouchAction<>(DriverFactory.getDriver())
			.press(PointOption.point(start_x, y))
			.waitAction()
			.moveTo(PointOption.point(end_x, y))
			.release()
			.perform();
	}
	
	public void scrollDown() {
		scroll(0.9, 0.1);
	}
	
	public void scrollUp() {
		scroll(0.1, 0.9);
	}
	
	public void swipeLeft() {
		swipe(0.9, 0.1);
	}
	
	public void swipeRight() {
		swipe(0.1, 0.9);
	}
	public void clicarLongo(String elemento) {
		MobileElement element = DriverFactory.getDriver().findElement(MobileBy.xpath("//*[@text='"+ elemento +"']"));
		new TouchAction<>(DriverFactory.getDriver())
		.longPress(ElementOption.element(element))
		.perform();
	}
	
}
