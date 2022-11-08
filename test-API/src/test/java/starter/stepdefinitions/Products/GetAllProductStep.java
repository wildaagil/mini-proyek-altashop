package starter.stepdefinitions.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.GetAllProduct;
import starter.Products.GetProductId;

public class GetAllProductStep {

    @Steps
    GetAllProduct getAllProduct;

    @Steps
    GetProductId getProductId;

    @Given("I set url api for get all products")
    public void iSetUrlApiForGetAllProducts() {
        getAllProduct.setUrlListProduct();
    }

    @When("I request list product")
    public void iRequestListProduct() {
        getAllProduct.requestListProduct();
    }

    @Then("I will get status code is 200")
    public void iWillGetStatusCodeIs200() {
        getAllProduct.verifyStatusCode200();
        getProductId.verifyStatusCode200();
    }
}
