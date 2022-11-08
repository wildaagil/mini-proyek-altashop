package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.OrderPage;

public class OrderSteps {

    @Steps
    OrderPage orderPage;

    @And("I click order button")
    public void iClickOrderButton() {
        orderPage.orderBtnClick();
    }

    @And("I click bayar button")
    public void iClickBayarButton() {
        orderPage.bayarBtnClick();
    }

    @Then("i on the transaction page")
    public void iOnTheTransactionPage() {
        orderPage.transactionHeaderDispayed();
    }

    @When("I click add button")
    public void iClickAddButton() {
        orderPage.buyBtnClick();
    }

    @And("I click add qty")
    public void iClickAddQty() {
        orderPage.addBtnClick();
    }

    @And("I click reduce qty")
    public void iClickReduceQty() {
        orderPage.reduceBtnClick();
    }

    @Then("i get message order is empty!")
    public void iGetMessageOrderIsEmpty() {
        orderPage.warningMessageDisplayed();
    }

    @When("I just click order button")
    public void iJustClickOrderButton() {
        orderPage.orderBtnClick();
    }
}
