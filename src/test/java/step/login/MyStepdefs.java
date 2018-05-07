package step.login;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import step.common.Hooks;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    public Hooks hooks = new Hooks();

    @Then("^I can see tenant dashboard$")
    public void iCanSeeTenantDashboard() throws Throwable {
        throw new PendingException();
    }

    @When("^I open Url$")
    public void iOpenUrl() throws Throwable {
        hooks.getDriver().get("http://www.gmail.com/");
        hooks.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Then("^I enter <username> and <password>$")
    public void iEnterUsernameAndPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I click on Submit Button$")
    public void iClickOnSubmitButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
