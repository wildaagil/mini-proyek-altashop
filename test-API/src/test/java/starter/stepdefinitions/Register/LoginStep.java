package starter.stepdefinitions.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.Login;

public class LoginStep {

    @Steps
    Login login;

    @Given("I set url for login")
    public void iSetUrlForLogin() {
        login.setUrl();
    }

    @And("I set body {string} email and {string} password login")
    public void iSetBodyEmailAndPasswordLogin(String email, String password) {
        login.setBody(email, password);
    }

    @When("I request login")
    public void iRequestLogin() {
        login.requestLogin();
    }

    @And("I get token")
    public void iGetToken() {
        login.getToken();
    }
}
