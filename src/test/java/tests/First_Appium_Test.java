package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

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
        driver.closeApp();
        driver.quit();

    }
}
