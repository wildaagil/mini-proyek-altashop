package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.GetProductId;

public class GetIdProductSteps {

    @Steps
    GetProductId getProductId;

    @Given("I set url for get id products")
    public void iSetUrlForGetIdProducts() {
        getProductId.setUrlListProductId();
    }

    @And("I get of my id product")
    public void iGetOfMyIdProduct() {
        getProductId.verifyProductId();
    }

    @Then("I will get status code is 404")
    public void iWillGetStatusCodeI404(){
        getProductId.verifyStatusCode404();
    }

    @And("I get error message record not found")
    public void iGetErrorMessageRecordNotFound() {
        getProductId.errorMessageProductId();
    }

    @Given("I set url for get invalid id products")
    public void iSetUrlForGetInvalidIdProducts() {
        getProductId.setUrlInvalidProductId();
    }

    @When("I request id product")
    public void iRequestIdProduct() {
        getProductId.requestIdProduct();
    }

    @When("I request invalid id product")
    public void iRequestInvalidIdProduct() {
        getProductId.requestInvalidIdProduct();
    }

    @Given("I set url to get a project")
    public void iSetUrlToGetAProject() {
        getProductId.setUrlListProductId();
    }

    @And("I get ID project")
    public void iGetIDProject() {
        getProductId.getIdProject();
    }

    @When("I request get detail project")
    public void iRequestGetDetailProject() {
        getProductId.requestGetDetail();
    }

    @Then("I get status code {int}")
    public void iGetStatusCode(int arg0) {
        getProductId.validateResponseId();
    }
}
