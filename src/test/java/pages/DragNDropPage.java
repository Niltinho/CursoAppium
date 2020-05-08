package pages;

import java.util.List;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import support.BasePage;
import support.DriverFactory;

public class DragNDropPage extends BasePage {
	
	public void arrastar(String origem, String destino) {
		MobileElement inicio = DriverFactory.getDriver().findElement(MobileBy.xpath("//*[@text='" + origem + "']"));
		MobileElement fim = DriverFactory.getDriver().findElement(MobileBy.xpath("//*[@text='" + destino + "']"));
		
		new TouchAction<>(DriverFactory.getDriver())
		.longPress(ElementOption.element(inicio))
		.moveTo(ElementOption.element(fim))
		.release()
		.perform();
	}
	
	public String[] obterLista() {
		List<MobileElement> elementos = DriverFactory.getDriver().findElements(MobileBy.className("android.widget.TextView"));
		String[] retorno = new String[elementos.size()];
		for(int i = 0; i < elementos.size(); i++) {
			retorno[i] = elementos.get(i).getText();
			//System.out.println("\"" + retorno[i] + "\", ");
		}
		return retorno;
	}
}
