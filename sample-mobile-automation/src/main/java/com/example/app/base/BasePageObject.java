package com.example.app.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class BasePageObject {

    public AndroidDriver<AndroidElement> getDriver(){
        return driver;
    }

    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(), 90, 3000);
    }

    public AndroidElement find(By locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator){

        // locator == By, atau kamu mau nge-locate atau nemuin suatu element by apa
        // dan valuenya apa

        // buat mekanisme untuk click
        // harus nemuin element dulu dari locator yg dikasih
        // baru kita kasih si method clicknya
        AndroidElement elm = find(locator);
        elm.click();
    }

    public void inputText(By locator, String input){
        AndroidElement elm = find(locator);
        elm.sendKeys(input);
        elm.click();
    }

    public void isDisplayed(By locator){
        AndroidElement elm = find(locator);
        elm.isDisplayed();
    }

    public String getText(By locator){
        return find(locator).getText();
    }

    public void clear(By locator){
        find(locator).clear();
    }

}
