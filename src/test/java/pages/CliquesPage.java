package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import support.BasePage;
import support.DriverFactory;

public class CliquesPage extends BasePage {
	
	public void selecionarCliqueLongo(String texto) {
		new TouchAction<>(DriverFactory.getDriver()).longPress
		(PointOption.point(DriverFactory.getDriver()
		.findElement(MobileBy.xpath("//*[@text='"+ texto +"']")).getCenter())).perform();
	}
	
	public String obterTextoCliqueLongo() {
		return DriverFactory.getDriver().findElement(MobileBy.xpath("(//android.widget.TextView)[3]")).getText();
	}
	
	public void selecionarCliqueDuplo() {
		clicarPorTexto("Clique duplo");
		clicarPorTexto("Clique duplo");
	}
	
	public String obterTextoCliqueDuplo() {
		return obterTexto(MobileBy.xpath("//*[@text='Duplo Clique']"));
	}

}
