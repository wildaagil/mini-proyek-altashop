package starter.stepdefinitions.Categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Categories.CreateCategori;

public class CreateCategoriStep {

    @Steps
    CreateCategori createCategori;

    @When("I request categori")
    public void iRequestCategori() {
        createCategori.requesCategori();
    }

    @Given("I set a url api for create categori")
    public void iSetAUrlApiForCreateCategori() {
        createCategori.setUrlCategori();
    }

    @And("I set body name and description")
    public void iSetBodyNameAndDescription() {
        createCategori.setBodyCategori();
    }

    @And("I set body empty name and description")
    public void iSetBodyEmptyNameAndDescription() {
        createCategori.setBodyEmptyNameCategori();
    }

    @Then("I will get status code is 500")
    public void iWillGetStatusCodeIs500() {
        createCategori.verifyStatusCode500();
    }

    @And("I set body name and empty description")
    public void iSetBodyNameAndEmptyDescription() {
        createCategori.setBodyEmptyDescriptionCategori();
    }

//    @And("I set body {string} name and {string} description")
//    public void iSetBodyNameAndDescription(String arg0, String arg1) {
//        createCategori.setBodyCategori();
//    }
//
//    @Then("I will get {string}")
//    public void iWillGet(String arg0) {
//    }
}
