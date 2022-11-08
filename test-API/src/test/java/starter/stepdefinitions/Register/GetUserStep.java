package starter.stepdefinitions.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.GetUser;

public class GetUserStep {

    @Steps
    GetUser getUser;

    @Given("I set url for get user")
    public void iSetUrlForGetUser() {
        getUser.setUrlGetUser();
    }

    @When("I request body get user")
    public void iRequestBodyGetUser() {
        getUser.requestGetUser();
    }

    @Then("I get user information")
    public void iGetUserInformation() {
        getUser.getUserInformation();
    }

}
