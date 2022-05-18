package Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class MyStepdefs {
    @Given("^i have an GET API$")
    public void iHaveAnGETAPI() throws Throwable {
        RestAssured.given().contentType(ContentType.JSON);
        throw new PendingException();
    }

    @When("^i invoke the API with \"([^\"]*)\"$")
    public void i_invoke_the_API_with(String arg1) throws Throwable {
        RestAssured.when().get("https://petstore.swagger.io/v2/pet/%s", arg1);
        throw new PendingException();
    }

    @Then("^i verify the response$")
    public void i_verify_the_response() throws Throwable {


        throw new PendingException();
    }

}

