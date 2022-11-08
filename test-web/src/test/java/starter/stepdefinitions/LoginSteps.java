package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    @Given("I am on the website page")
    public void iAmOnTheWebsitePage() {
        loginPage.openUrl();
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        loginPage.inputEmail("aaa");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("Pasword!123");
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will go to dashboard")
    public void iWillGoToDashboard() {
        loginPage.headerDisplayed();
    }

    @And("I input valid {string} email and {string} password")
    public void iInputValidEmailAndPassword(String arg0, String arg1) {
        loginPage.inputEmail(arg0);
        loginPage.inputPassword(arg1);
    }

    @Then("I will get the {string}")
    public void iWillGetThe(String result) {
        if (result.equals("i can login")){
            loginPage.headerDisplayed();
        } else if (result.equals("i cant login")) {
            loginPage.errorMessageDisplayed();
        }
    }

    @When("I clik sigin button")
    public void iClikSiginButton() {
        loginPage.clickSiginBtn();
    }
}
