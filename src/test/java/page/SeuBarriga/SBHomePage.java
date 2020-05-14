package page.SeuBarriga;

import io.appium.java_client.MobileBy;
import support.BasePage;
import support.DriverFactory;

public class SBHomePage extends BasePage {
	
	public String validarSaldoConta(String valor) {
		return obterTexto(MobileBy.xpath("//*[@text='"+ valor +"']"));
	}
	
	public void scrollDown() {
		scrollElement(DriverFactory.getDriver().findElement(MobileBy.xpath("//*[@class='android.widget.ScrollView']")), 0.9, 0.1);
	}

}
