package support;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class BasePage {
	
	public void escreverCampo(By by, String nome) {
		DriverFactory.getDriver().findElement(by).sendKeys(nome);
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
}
