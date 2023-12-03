package org.example.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;




public class TestBase {

    protected AppiumDriver driver;
    protected WebDriverWait webDriverWait;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");


                desiredCapabilities.setCapability("platformName", "Android");
                desiredCapabilities.setCapability("appium:platformVersion", "13");
                desiredCapabilities.setCapability("appium:deviceName", "Pixel 6");
                desiredCapabilities.setCapability("appium:noReset", true);
                desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
                desiredCapabilities.setCapability("appium:appPackage", "de.cominto.blaetterkatalog.customer.mm");
                desiredCapabilities.setCapability("appium:appActivity", "com.iapps.munchenmerkur.MainActivity");
                driver = new AndroidDriver(remoteUrl, desiredCapabilities);


        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
