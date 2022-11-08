package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

    private By taskHeader = MobileBy.AccessibilityId("Products");

    private By loginIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    private By fieldEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    private By fiealdPassword = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

   private By loginBtn = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");

    private By dashboardHeader = By.xpath("//android.widget.ScrollView");

    private By errorEmail = MobileBy.AccessibilityId("email can not empty");

    private By errorPassword = MobileBy.AccessibilityId("password can not empty");

    public void taskHeaderDisplayed(){
        // AndroidElement headerElm = driver.findElement(taskHeader);
        // AndroidElement headerElm = find(taskHeader);
        // headerElm.isDisplayed();
        isDisplayed(taskHeader);
    }

    public void clickLoginIcon(){
        click(loginIcon);
    }

    public void inputEmail(String email){
        click(fieldEmail);

        AndroidElement elm = find(fieldEmail);
        elm.sendKeys(email);
    }

    public void inputPassword(String password){
        click(fiealdPassword);

        AndroidElement elm = find(fiealdPassword);
        elm.sendKeys(password);
    }

    public void clickLoginBtn(){
        click(loginBtn);
    }

    public void dashboardDisplayed(){
        isDisplayed(dashboardHeader);
    }

    public void errorMessageEmail(){
        isDisplayed(errorEmail);
    }

    public void errorMessagePassword(){
        isDisplayed(errorPassword);
    }
}
