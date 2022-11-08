package starter.stepdefinitions.Hello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Hello.GetHello;

public class GetHelloStep {

    @Steps
    GetHello getHello;

    @Given("I set url for get hello")
    public void iSetUrlForGetHello() {
        getHello.SetUrlGetHello();
    }

    @When("I request body get hello")
    public void iRequestBodyGetHello() {
        getHello.requestBodyHello();
    }

    @And("I get respons data hellot")
    public void iGetResponsDataHellot() {
        getHello.responsGetHello();
    }
}
