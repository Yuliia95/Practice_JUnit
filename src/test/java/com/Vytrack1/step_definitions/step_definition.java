package com.Vytrack1.step_definitions;

import com.Vytrack1.pages.LoginPage;
import com.Vytrack1.utilities.Driver;
import com.Vytrack1.utilities.Vytrack1_data;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class step_definition {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.get().get(Vytrack1_data.get("url"));
    }

    @When("user login as a {string}")
    public void user_login_as_a(String user) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(user);
        System.out.println();
    }

    @Then("user should be able to see dashboard page")
    public void user_should_be_able_to_see_dashboard_page() {
        System.out.println("test pass");
    }

}
