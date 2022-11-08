package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.LogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogoutStep {

    @Steps
    LoginPage loginPage;

    @Steps
    LogoutPage logoutPage;
    @Given("I have logged in")
    public void iHaveLoggedIn() {
        loginPage.taskHeaderDisplayed();
        loginPage.clickLoginIcon();
        loginPage.inputEmail("aaa");
        loginPage.inputPassword("Pasword!123");
        loginPage.clickLoginBtn();
        loginPage.dashboardDisplayed();
    }

    @When("I click logout button")
    public void iClickLogoutButton() {
        logoutPage.clickLogoutBtn();
    }

    @Then("I will go back to home page")
    public void iWillGoBackToHomePage() {
        logoutPage.homePageDisplayed();
    }
}
