package starter.stepdefinitions.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.CreateAccount;

public class CreateAccountStep {

    @Steps
    CreateAccount createAccount;

    @Given("I set url for create account")
    public void iSetUrlForCreateAccount() {
        createAccount.setUrl();
    }

    @When("I set body {string} email account")
    public void iSetBodyEmailAccount(String email) {
        createAccount.setBodyEmail(email);
    }

    @And("I set body {string} password account")
    public void iSetBodyPasswordAccount(String password) {
        createAccount.setBodyPassword(password);
    }

    @And("I set body {string} fullname account")
    public void iSetBodyFullnameAccount(String fullname) {
        createAccount.setBodyFullname(fullname);
    }

    @Then("I request account")
    public void iRequestAccount() {
        createAccount.requestAccount();
    }

    @And("I will get status code is {string}")
    public void iWillGetStatusCodeIs(String result) {
        if(result.equals("succes")){
            createAccount.statusCode200();
        } else if (result.equals("error")) {
            createAccount.statusCode400();
        }
    }
}
