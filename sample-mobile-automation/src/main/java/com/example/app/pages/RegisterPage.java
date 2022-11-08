package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class RegisterPage extends BasePageObject {

    private By taskHeader = MobileBy.AccessibilityId("Products");

    private By registerText = MobileBy.AccessibilityId("Register");

    private By fieldFullname = By.xpath("//android.widget.EditText[1]");

    private By fieldEmail = By.xpath("//android.widget.EditText[2]");

    private By fieldPassword = By.xpath("//android.widget.EditText[3]");

    private By registerBtn = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");

    private By errorFn = MobileBy.AccessibilityId("fullname can not empty");

    private By errorEmail = MobileBy.AccessibilityId("email can not empty");

    private By errorPassword = MobileBy.AccessibilityId("password can not empty");

    public void headerDisplayed(){
        isDisplayed(taskHeader);
    }

    public void clickRegister(){
        click(registerText);
    }

    public void inputFullname(String fullname){
        click(fieldFullname);

        AndroidElement elm = find(fieldFullname);
        elm.sendKeys(fullname);
    }

    public void inputEmail(String email){
        click(fieldEmail);

        AndroidElement elm = find(fieldEmail);
        elm.sendKeys(email);
    }

    public void inputPassword(String password){
        click(fieldPassword);

        AndroidElement elm = find(fieldPassword);
        elm.sendKeys(password);
    }

    public void clickBtnRegister(){
        click(registerBtn);
    }

    public void errorFnDisplayed(){
        isDisplayed(errorFn);
    }

    public void errorEmailDisplayed(){
        isDisplayed(errorEmail);
    }

    public void errorPasswordDisplayed(){
        isDisplayed(errorPassword);
    }
}
