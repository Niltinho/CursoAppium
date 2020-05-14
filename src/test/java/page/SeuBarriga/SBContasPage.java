package page.SeuBarriga;

import io.appium.java_client.MobileBy;
import support.BasePage;

public class SBContasPage extends BasePage {
	
	public void setConta(String nome) {
		escreverCampoPorTexto("Conta", nome);
	}
	
	public void clicarBotaoSalvar() {
		clicarPorTexto("SALVAR");
	}
	
	public String validarContaCriada() {
		return obterTexto(MobileBy.xpath("//*[@text='Conta adicionada com sucesso']"));
	}
	
	public void cliqueLongo(String conta) {
		clicarLongo(conta);
	}
	
	public void clicarBotaoExcluir() {
		clicarPorTexto("EXCLUIR");
	}
	
	public String validarContaExcluida() {
		return obterTexto(MobileBy.xpath("//*[@text='Conta excluída com sucesso']"));
	}

}
