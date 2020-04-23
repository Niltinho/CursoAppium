package pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import support.BasePage;

public class FormularioPage extends BasePage{
	
	public void setNome(String nome) {
		escreverCampo(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		return obterTexto(MobileBy.AccessibilityId("nome"));
	}
	
	public void setConsole(String console) {
		selecionarCombo(MobileBy.AccessibilityId("console"), console);
	}
	
	public String obterConsole() {
		return obterTexto(MobileBy.id("android:id/text1"));
	}
	
	public void clicarCheckBox() {
		clicar(MobileBy.AccessibilityId("check"));
	}
	
	public void clicarSwitch() {
		clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean isCheckMarcado() {
		return isCheckMarcado(MobileBy.AccessibilityId("check"));
	}
	
	public boolean isSwitchMarcado() {
		return isCheckMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	public void clicarSalvar() {
		clicarPorTexto("SALVAR");
	}
	
	public String obterNomeCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
	}
	
	public String obterConsoleCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
	}
	
	public String obterCheckCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));
	}
	
	public String obterSwitchCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
	}

}
