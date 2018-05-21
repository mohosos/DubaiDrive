import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

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
		//MobileElement e7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[8]/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]");
		//e7.click();
		//MobileElement e8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[8]/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[3]/android.view.View[4]/android.view.View[2]/android.view.View/android.view.View[1]");
		//e8.click();
		//MobileElement e9 = (MobileElement) driver.findElementById("sidePanelHeaderActionBtn");
		//e9.click();
		(new TouchAction(driver)).tap(291, 73).perform() ;
		(new TouchAction(driver)).tap(291, 73).perform() ;
		//(new TouchAction(driver)).tap(291, 73).perform() ;
		MobileElement el0 = (MobileElement) driver.findElementById("loginTap");
		el0.click();
		(new TouchAction(driver)).tap(191, 308).perform() ;
		MobileElement el1 = (MobileElement) driver.findElementById("usernameField");
		el1.click();
		el1.sendKeys("ehabaaaaaa");
		MobileElement el4 = (MobileElement) driver.findElementById("passwordInput");
		el4.sendKeys("Test@1234");
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]");
		el2.click();
		(new TouchAction(driver)).tap(625, 961).perform() ;
		//(new TouchAction(driver)).tap(625, 961).perform() ;


		
		
	}

	
}
