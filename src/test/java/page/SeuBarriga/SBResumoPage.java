package page.SeuBarriga;

import io.appium.java_client.MobileBy;
import support.BasePage;
import support.DriverFactory;

public class SBResumoPage extends BasePage {
	
	public void excluirMovimentacao(String desc) {
		swipeElement(DriverFactory.getDriver().findElement(MobileBy.xpath("//*[@text='"+ desc +"']/..")), 0.9, 0.1);
		clicarPorTexto("Del");
	}

}
