import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Secnarios extends Base {
	@Test
	public void record () {
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]")).click();
		//MobileElement e1 = (MobileElement) driver.findElementById("btnEn");
		//e1.click();
		MobileElement e2 = (MobileElement) driver.findElementById("tcBtn");
		e2.click();
		MobileElement e4 = (MobileElement) driver.findElementById("closeBtn");
		e4.click();
		MobileElement e5 = (MobileElement) driver.findElementById("saveButton");
		e5.click();
		MobileElement e6 = (MobileElement) driver.findElementById("sidePanelHeaderActionBtn");
		e6.click();
		MobileElement e7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[8]/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]");
		e7.click();

		
		
	}

}
