Feature: GET - ListUser

  @GFIT-User012
  Scenario: GET - As admin I can get list user
    Given I set the api GET endpoint
    When I send HTTP GET request
    Then I receive valid HTTP response code 200
  And receive valid data for detail user
