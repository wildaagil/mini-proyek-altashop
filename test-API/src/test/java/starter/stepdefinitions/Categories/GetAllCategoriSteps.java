package starter.stepdefinitions.Categories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Categories.GetAllCategori;

public class GetAllCategoriSteps {

    @Steps
    GetAllCategori getAllCategori;

    @Given("I set url for get all categories")
    public void iSetUrlForGetAllCategories() {
        getAllCategori.setUrlGetAllCategori();
    }

    @When("I request list categories")
    public void iRequestListCategories() {
        getAllCategori.requestCategori();
    }
}
