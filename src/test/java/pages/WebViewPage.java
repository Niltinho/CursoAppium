package pages;

import java.util.Set;

import org.openqa.selenium.By;

import support.BasePage;
import support.DriverFactory;

public class WebViewPage extends BasePage{
	
	public void entrarContextoWeb() {
		Set<String> contextHandles = DriverFactory.getDriver().getContextHandles();
		/*for(String valor: contextHandles) {
			System.out.println(valor);
		}*/
		DriverFactory.getDriver().context((String) contextHandles.toArray()[1]);
	}
	
	public void setEmail(String email) {
		DriverFactory.getDriver().findElement(By.id("email")).sendKeys(email);
	}
	
	public void setSenha(String senha) {
		DriverFactory.getDriver().findElement(By.id("senha")).sendKeys(senha);
	}
	
	public void clicarBotaoEntrar() {
		clicar(By.xpath("//button[text()='Entrar']"));
	}
	
	public void sairContextoWeb() {
		DriverFactory.getDriver().context((String) DriverFactory.getDriver().getContextHandles().toArray()[0]);
	}
	
	public String obterMensagem() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

}
