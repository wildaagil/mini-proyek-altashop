package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.OrderPage;

public class AddProductSteps {

    @Steps
    OrderPage orderPage;

    @Then("i on the order page")
    public void iOnTheOrderPage() {
        orderPage.bayarButtonDisplayed();
    }
}
