package pages;

import io.appium.java_client.MobileBy;
import support.BasePage;

public class AlertPage extends BasePage {
	
	public void clicarAlertaSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public String obterTituloAlerta() {
		return obterTexto(MobileBy.id("android:id/alertTitle"));
	}
	
	public String obterMensagemAlerta() {
		return obterTexto(MobileBy.id("android:id/message"));
	}
	
	public void clicarBotaoConfirmar() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public void clicarBotaoSair() {
		clicarPorTexto("SAIR");
	}
	
	public void clicarForaCaixa() {
		tap(50, 150);
	}

}
