package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OrderSuccessful;
import pages.Payment;

import pages.Home;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.Map;


public class guru99Steps extends BrowserUtils {
    Payment Payment =new Payment();
    Home Home =new Home();
    OrderSuccessful PaymentSuccessful = new OrderSuccessful();
    @Given("The user wants to go to Payment Gateway Website")
    public void the_user_wants_to_go_to_payment_gateway_website() {

        Driver.getDriver().get(ConfigurationsReader.getProperties("URL"));
        BrowserUtils.setWaitTime();

    }

    @When("The user wants to verify that to see {string}")
    public void the_user_wants_to_verify_that_to_see(String string) {

        Home.setToyHeader(string);
    }

    @Then("The user wants to verify that the {string}")
    public void the_user_wants_to_verify_that_the(String string) {

        Home.setToyPrice(string);
    }

    @Then("The user wants to verify that the URL should contain {string}")
    public void the_user_wants_to_verify_that_the_url_should_contain(String string) {
        Home.verifyURL(string);

    }

    @Then("The user wants to buy elephant toys as {string}")
    public void the_user_wants_to_buy_elephant_toys_as(String string) {
        Home.setQuantityDropdown(string);
        Home.setBuyNow();
    }

    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String,String> dataTable) {
        Payment.setCCard(dataTable.get("CardNumber"));
        Payment.setEMonth(dataTable.get("ExpirationMonth"));
        Payment.setEYear(dataTable.get("ExpirationYear"));
        Payment.setCvvCode(dataTable.get("CVVCode"));

    }
    @Then("The user wants to click on pay now")
    public void the_user_wants_to_click_on_pay_now() {

        Payment.setPayNow();
    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {

        PaymentSuccessful.setVerifyMessage(string);

    }
    @Then("The user wants to add new {string}")
    public void the_user_wants_to_add_new(String string) {
        Home.setQuantity(string);
        Home.setBuy();

    }


}