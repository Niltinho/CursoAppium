package pages;

import io.appium.java_client.MobileBy;
import support.BasePage;

public class AbaPage extends BasePage {
	
	public String obterTextoAba1() {
		return obterTexto(MobileBy.xpath("//*[@text='Este � o conte�do da Aba 1']"));
	}
	
	public void acessarAba2() {
		clicarPorTexto("ABA 2");
	}
	
	public String obterTextoAba2() {
		return obterTexto(MobileBy.xpath("//*[@text='Este � o conte�do da Aba 2']"));
	}
}
