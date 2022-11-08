package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterSteps {

    @Steps
    RegisterPage registerPage;

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        registerPage.openUrl();
    }

    @When("I input {string} fullname {string} email and {string} password")
    public void iInputFullnameEmailAndPassword(String arg0, String arg1, String arg2) {
        registerPage.inputFullName(arg0);
        registerPage.inputEmail(arg1);
        registerPage.inputPassword(arg2);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registerPage.clickRegisterBtn();
    }

    @Then("I can {string} regist account")
    public void iCanRegistAccount(String result) {
        if (result.equals("succes")){
            registerPage.headerLoginDisplayed();
        } else if (result.equals("error")){
            registerPage.errorIconDisplayed();
        }
    }
}
