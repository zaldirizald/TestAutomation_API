package starter.stepdefiniton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetListUser;

public class GetListUserSteps {
    @Steps
    GetListUser getListUserSteps;

    @Given("I set the api GET endpoint")
    public void userSetGet() {
        getListUserSteps.userSetGet();
    }

    @When("I send HTTP GET request")
    public void userSendGET() {
        getListUserSteps.userSendGET();
    }

    @Then("I receive valid HTTP response code 200")
    public void validateResponseCode() {
        getListUserSteps.validateResponseCode();
    }


    @And("receive valid data for detail user")
        public void validateData(){
            getListUserSteps.validateData();
        }
    }

