package pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import support.DSL;

public class FormularioPage {
	
	private DSL dsl = new DSL();
	
	public void setNome(String nome) {
		dsl.escreverCampo(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		return dsl.obterTexto(MobileBy.AccessibilityId("nome"));
	}
	
	public void setConsole(String console) {
		dsl.selecionarCombo(MobileBy.AccessibilityId("console"), console);
	}
	
	public String obterConsole() {
		return dsl.obterTexto(MobileBy.id("android:id/text1"));
	}
	
	public void clicarCheckBox() {
		dsl.clicar(MobileBy.AccessibilityId("check"));
	}
	
	public void clicarSwitch() {
		dsl.clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean isCheckMarcado() {
		return dsl.isCheckMarcado(MobileBy.AccessibilityId("check"));
	}
	
	public boolean isSwitchMarcado() {
		return dsl.isCheckMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	public void clicarSalvar() {
		dsl.clicarPorTexto("SALVAR");
	}
	
	public String obterNomeCadastrado() {
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
	}
	
	public String obterConsoleCadastrado() {
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
	}
	
	public String obterCheckCadastrado() {
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));
	}
	
	public String obterSwitchCadastrado() {
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
	}

}
