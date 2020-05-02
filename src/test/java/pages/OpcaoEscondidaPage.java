package pages;

import io.appium.java_client.MobileBy;
import support.BasePage;

public class OpcaoEscondidaPage extends BasePage {
	
	public String obterMensagemSucesso() {
		return obterTexto(MobileBy.xpath("//*[@text='Você achou essa opção']"));
	}
	
	public void clicarOk() {
		clicarPorTexto("OK");
	}

}
