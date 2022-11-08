package starter.stepdefinitions.Categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Categories.GetIdCategori;

public class GetCategoriIdStep {

    @Steps
    GetIdCategori getIdCategori;

    @Given("I set url for get id categori")
    public void iSetUrlForGetIdCategori() {
        getIdCategori.setUrlGetValidCategoriId();
    }

    @When("I request id categori")
    public void iRequestIdCategori() {
        getIdCategori.requestValidCategoriId();
    }

    @And("I get of my id categori")
    public void iGetOfMyIdCategori() {
        getIdCategori.getValidCategoriId();
    }

    @Given("I set url for get invalid id categori")
    public void iSetUrlForGetInvalidIdCategori() {
        getIdCategori.setUrlGetInvalidIdCategori();
    }

    @When("I request invalid id categori")
    public void iRequestInvalidIdCategori() {
        getIdCategori.requestInvalidValidCategoriId();
    }
}
