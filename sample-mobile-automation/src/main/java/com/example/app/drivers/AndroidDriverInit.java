package com.example.app.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit {

    public static AndroidDriver<AndroidElement> driver;

    public static void initialization(){

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "12");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "C:\\Users\\ACER\\Documents\\Mini_Proyek\\sample-mobile-automation\\src\\test\\resources\\application\\app-release.apk");

        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    public static void close(){
        driver.quit(); //kita matiin drivernya
    }
}
