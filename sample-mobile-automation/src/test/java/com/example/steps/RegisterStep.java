package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class RegisterStep {

    @Steps
    RegisterPage registerPage;
    
    @Steps
    LoginPage loginPage;

    @And("I click register")
    public void iClickRegister() {
        registerPage.clickRegister();
    }

    @And("I input {string} fullname")
    public void iInputFullname(String fullname) {
        registerPage.inputFullname(fullname);
    }

    @And("I input {string} email")
    public void iInputEmail(String email) {
        registerPage.inputEmail(email);
    }

    @And("I input {string} password")
    public void iInput(String password) {
        registerPage.inputPassword(password);
    }

    @And("I clck button register")
    public void iClckButtonRegister() {
        registerPage.clickBtnRegister();
    }

    @Then("I am get {string} result")
    public void iAmGet(String result) {
        if (result.equals("succes")){
            registerPage.headerDisplayed();
        }else if (result.equals("errorFn")){
            registerPage.errorFnDisplayed();
        } else if (result.equals("errorEmail")){
            registerPage.errorEmailDisplayed();
        } else if (result.equals("errorPass")){
            registerPage.errorPasswordDisplayed();
        } else if (result.equals("allError")){
            registerPage.errorFnDisplayed();
            registerPage.errorEmailDisplayed();
            registerPage.errorPasswordDisplayed();
        }
    }
}
