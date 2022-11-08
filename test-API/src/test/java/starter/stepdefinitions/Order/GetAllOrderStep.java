package starter.stepdefinitions.Order;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Order.GetAllOrder;

public class GetAllOrderStep {

    @Steps
    GetAllOrder getAllOrder;
    @When("I request body get all order")
    public void iRequestBodyGetAllOrder() {
        getAllOrder.requestGetAllOrder();
    }

    @Given("I set url for get all order")
    public void iSetUrlForGetAllOrder() {
        getAllOrder.setUrlGetAllOrder();
    }
}
