package starter.stepdefinitions.Order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.Order.CreateOrder;

public class CreateOrderStep {

    @Steps
    CreateOrder createOrder;

    @Given("I set url for create order")
    public void iSetUrlForCreateOrder() {
        createOrder.setUrlCreateOrder();
    }

    @And("I set body create order")
    public void iSetBodyCreateOrder() {
        createOrder.setBodyCreateOrder();
    }

    @When("I request body create order")
    public void iRequestBodyCreateOrder() {
        createOrder.setRequestCreateOrder();
    }
}
