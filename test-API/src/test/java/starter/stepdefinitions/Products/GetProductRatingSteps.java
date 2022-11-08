package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.GetProductRating;

public class GetProductRatingSteps {

    @Steps
    GetProductRating getProductRating;

    @Given("I set url for get rating product")
    public void iSetUrlForGetRatingProduct() {
        getProductRating.setUrlRating();

    }

    @When("I request rating product")
    public void iRequestRatingProduct() {
        getProductRating.requestRating();
    }

    @Then("I get status code is 200")
    public void iGetStatusCodeIs200() {
        getProductRating.statusCode200();
    }

    @And("I get rating product")
    public void iGetRatingProduct() {
        getProductRating.verifyRating();
    }
}
