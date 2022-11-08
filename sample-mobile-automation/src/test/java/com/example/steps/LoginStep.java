package com.example.steps;

import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStep {

    @Steps
    LoginPage loginPage;
    @Given("I on the page")
    public void iOnThePage() {
        loginPage.taskHeaderDisplayed();
    }

    @When("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginIcon();
    }

    @And("I input email")
    public void iInputEmail() {
        loginPage.inputEmail("aaa");
    }

    @And("I input password")
    public void iInputPassword() {
        loginPage.inputPassword("Pasword!123");
    }

    @And("I clck button login")
    public void iClckButtonLogin() {
        loginPage.clickLoginBtn();
    }

    @Then("I am on the dashboard")
    public void iAmOnTheDashboard() {
        loginPage.dashboardDisplayed();
    }

    @And("I input invalid email")
    public void iInputInvalidEmail() {
        loginPage.inputEmail("ajaa");
    }

    @Then("I am get email can not empty")
    public void iAmGetEmailCanNotEmpty() {
        loginPage.errorMessageEmail();
    }

    @Then("I am get password can not empty")
    public void iAmGetPasswordCanNotEmpty() {
        loginPage.errorMessagePassword();
    }
}
