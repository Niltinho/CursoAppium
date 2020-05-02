package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import support.BasePage;
import support.DriverFactory;

public class SwipeListPage extends BasePage {
	
	public void swipeElementLeft(String opcao) {
		swipeElement(DriverFactory.getDriver().findElement(MobileBy.xpath("//*[@text='"+ opcao +"']/..")), 0.1, 0.9);
	}
	
	public void swipeElementRigth(String opcao) {
		swipeElement(DriverFactory.getDriver().findElement(MobileBy.xpath("//*[@text='"+ opcao +"']/..")), 0.9, 0.1);
	}
	
	public void clicarBotaoMais() {
		MobileElement botao = DriverFactory.getDriver().findElement(MobileBy.xpath("//*[@text='(+)']/.."));
		new TouchAction<>(DriverFactory.getDriver()).tap(ElementOption.element(botao, -50, 0)).perform();
	}
	
	public void clicarBotaoMenos() {
		clicarPorTexto("(-)");
	}
	
}