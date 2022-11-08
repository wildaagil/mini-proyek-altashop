package starter.stepdefinitions.Order;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Order.GetOrderId;

public class GetOrderIdStep {

    @Steps
    GetOrderId getOrderId;
    @Given("I set url for get order id")
    public void iSetUrlForGetOrderId() {
        getOrderId.setUrlGetOrderId();
    }

    @When("I request body get order id")
    public void iRequestBodyGetOrderId() {
        getOrderId.requestOrderId();
    }
}
