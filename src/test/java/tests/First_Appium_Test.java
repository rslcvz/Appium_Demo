package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.print.attribute.standard.PagesPerMinute;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class First_Appium_Test {

    public AppiumDriver driver;
    @Test
    public void test1(){

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName", "Pixel_2_API_24");
        desiredCapabilities.setCapability("platform", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("app", System.getProperty("user.dir")+"\\etsy.apk");
//        desiredCapabilities.setCapability("adbExecTimeout", "20000");

        //"C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Android Studio\Android Studio.lnk"   // path for android studio
        try {
            driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

//        driver.findElementByXPath("//*[@text='Favorites']").click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementById("com.etsy.android:id/search_src_text").sendKeys("shoes");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementById("c856d3e6-f967-4da3-98d2-4b5d955c08a9").click();
        driver.findElementById("com.etsy.android:id/btn_link").click();

        driver.findElementById("com.etsy.android:id/edit_username").sendKeys("rslceviz@gmail.com");
        driver.findElementById("com.etsy.android:id/edit_password").sendKeys("691691691r");
        driver.findElementById("com.etsy.android:id/button_signin").click();
    }
}
