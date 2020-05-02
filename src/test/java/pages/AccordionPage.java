package pages;

import io.appium.java_client.MobileBy;
import support.BasePage;

public class AccordionPage extends BasePage {
	
	public void selecionarOpcao(String opcao) {
		clicarPorTexto("Opção " + opcao);
	}
	
	public String obterDescricaoOpcao(String opcao) {
		return obterTexto(MobileBy.xpath("//*[@text='Esta é a descrição da opção " + opcao +"']"));
	}
}
