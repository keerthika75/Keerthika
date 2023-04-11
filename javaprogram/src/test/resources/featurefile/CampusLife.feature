Feature: validate the flexiable application
  Scenario: validate the login page of flexiable
  @TestCase1
  Scenario: validate to the login page of campuslife
    Given user should navigate to the campuslife
    When user enter to the "Keerthi" and "maths" and "keerthi689@gmail.com"
    And User enter to the "Tamilnadu" and "hi"
    Then user should clicks login button