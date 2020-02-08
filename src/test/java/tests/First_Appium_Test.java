package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.print.attribute.standard.PagesPerMinute;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class First_Appium_Test extends Appium_Base {

//    public AppiumDriver driver;
    @Test
    public void test2() throws InterruptedException {

//        driver.findElementById("c856d3e6-f967-4da3-98d2-4b5d955c08a9").click();
        driver.findElementById("com.etsy.android:id/btn_link").click();

        driver.findElementById("com.etsy.android:id/edit_username").sendKeys("rslceviz@gmail.com");
        driver.findElementById("com.etsy.android:id/edit_password").sendKeys("691691691r");
        driver.findElementById("com.etsy.android:id/button_signin").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement input = driver.findElementById("com.etsy.android:id/search_src_text");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      input.sendKeys("shoes");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.getKeyboard().pressKey(Keys.ENTER);
        Thread.sleep(5000);

    }
}
