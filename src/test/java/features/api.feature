
Feature: To launch POST API
@test
    Scenario: To launch POST API

    Given  i have an GET API
    When i invoke the API with "9223372036854014000"
    Then i verify the response
