package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.print.attribute.standard.PagesPerMinute;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class First_Appium_Test extends Appium_Base {

//    public AppiumDriver driver;
    @Test
    public void test2() throws InterruptedException, AWTException {

        WebDriverWait wait = new WebDriverWait(driver, 10);

//        driver.findElementById("c856d3e6-f967-4da3-98d2-4b5d955c08a9").click();
        driver.findElementById("com.etsy.android:id/btn_link").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("com.etsy.android:id/edit_username").sendKeys("rslceviz@gmail.com");
        driver.findElementById("com.etsy.android:id/edit_password").sendKeys("691691691r");

        driver.findElementById("com.etsy.android:id/button_signin").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement input = driver.findElement(MobileBy.id("com.etsy.android:id/search_src_text"));

        input.sendKeys("shoes");

        wait.until(ExpectedConditions.textToBe(MobileBy.id("com.etsy.android:id/search_src_text"), "shoes"));
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget." +
                "FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget." +
                "LinearLayout[1]/android.widget.TextView").click();
//        driver.findElementByAccessibilityId("moonkoosa boots knitting pattern").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.etsy.android:id/listing_image")));
        WebElement firstResult = driver.findElement(MobileBy.id("com.etsy.android:id/listing_image"));
        wait.until(ExpectedConditions.visibilityOf(firstResult));

        TouchAction action = new TouchAction(driver);
        action.tap(new TapOptions().withElement(new ElementOption().withElement(firstResult))).perform();
        driver.findElementById("com.etsy.android:id/button_express_checkout").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.etsy.android:id/button_express_checkout")));
    }
}
