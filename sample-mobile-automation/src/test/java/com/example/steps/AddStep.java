package com.example.steps;

import com.example.app.pages.AddPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddStep {

    @Steps
    AddPage addPage;

    @When("I click buy button")
    public void iClickBuyButton() {
        addPage.clickBuyBtn();
    }

    @Then("The product is added to the cart")
    public void theProductIsAddedToTheCart() {
        addPage.cartDispalyed();
    }
}
