
Feature: To verify API automation with Rest Assured

  Scenario: To Verify Rest Service GET Method
    Given API GET Service is available
    When I submit the GET request
    Then I should get 200 success Status code


