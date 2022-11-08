package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;

public class LogoutSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    LogoutPage logoutPage;
    @Given("I have logged in")
    public void iHaveLoggedIn() {
        loginPage.openUrl();
        loginPage.clickSiginBtn();
        loginPage.inputEmail("aaa");
        loginPage.inputPassword("Pasword!123");
        loginPage.clickLoginBtn();
        loginPage.headerDisplayed();
    }

    @When("I click profile menu")
    public void iClickProfileMenu() {
        logoutPage.clickProfile();
    }

    @And("I click logout button")
    public void iClickLogoutButton() {
        logoutPage.clickLogout();
    }

    @Then("I will go back to login page")
    public void iWillGoBackToLoginPage() {
        logoutPage.loginPageDisplayed();
    }
}
