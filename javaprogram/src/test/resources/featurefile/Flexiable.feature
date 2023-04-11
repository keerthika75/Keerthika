Feature: to validate the flexiable login page of application
  @TestCase2
  Scenario: validate the login page
    Given user should navigate to the login page fiexiable application
    And user should enter the firstname"keerthi" lastname "mercy" company "marudhar"
    When user should enter the destination "tirupur" mail "keerthimercy1019@gmail.com"
    And user enter the mobile number "9597006347"
    Then user clicks to the submit button

    @TestCase3
    Scenario: validate the tutorial
      Given user should navigate to the login page tutorial
      When user should select the components and moniator button
      Then user should select to the apple