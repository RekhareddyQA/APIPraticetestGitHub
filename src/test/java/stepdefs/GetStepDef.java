package stepdefs;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.given;

public class GetStepDef {
    private Response response;
    private RequestSpecification request;
    private String BaseURI= "http://dummy.restapiexample.com/api/v1/employees";

    @Given("^API GET Service is available$")
    public void api_GET_Service_is_available() throws Throwable {
        request=given();
        System.out.println("MY given step is executed");

    }

    @When("^I submit the GET request$")
    public void i_submit_the_GET_request() throws Throwable {
        response=request.when().get(BaseURI);
        System.out.println("response :" + response.prettyPrint());
        System.out.println("my When step is executed");
    }

    @Then("^I should get (\\d+) success Status code$")
    public void i_should_get_success_Status_code(int arg1) throws Throwable {
        response.then().statusCode(204);
        System.out.println("My Then is executed");
    }

}
