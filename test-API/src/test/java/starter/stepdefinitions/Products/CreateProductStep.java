package starter.stepdefinitions.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.CreateProduct;

public class CreateProductStep {

    @Steps
    CreateProduct createProduct;

    @Given("I set url for create products")
    public void iSetUrlForCreateProducts() {
        createProduct.setUrlCreateProduct();
    }

    @When("I set body product")
    public void iSetBodyProduct() {
        createProduct.setBodyProduct();
    }

    @Then("I request product")
    public void iRequestProduct() {
        createProduct.requestProduct();
    }

}
