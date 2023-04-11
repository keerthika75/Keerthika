@AmazonTest
Feature: To validate the login page of amazon application
@AmazonLogin
  Scenario: To validate to the proper creditor for amazon application
    Given user should navigate to the home page
    And user clicks to the hello sign in option and enter the email id "keerthimercy1019@gmail.com" and  clicks to the continue button
    When user enter to the password "Sms@8870"
    Then user clicks to the signin button
@MouseAction
Scenario: To validate to the signout of amazon application
  Given user should navigate to the home page
  When user clicks to the keerthi signin button
  Then user drag and drop to the signout button
  And user validate to the title of "amazon.com" application
@DragAndDrop
Scenario: To validate the drag and drop application
  Given user should navigate to the home page
  When user select to the iframe
  Then user select to the target and source frame on drag and drop
@Test1
Scenario: To validate the partial text
  Given user should navigate to the home page
  When user select to the search button
  And user pass to the biry value
@Test2
Scenario: To validate to the search products
  