Feature: To validate the login functionality of sales force application


  Scenario: To validate the valid username and password
    Given user should navigate to the salesforce application
    When user enter the username and password
   # And user should clicks to the login button

@smokeTest
  Scenario: To validate to the error messages
    Given user should navigate to the salesforce application
    When user should enter the username "LearnMore" and password "567"
    And user should clicks to the login button
    Then user get the error message "Please check your username and password. If you still can't log in, contact your Salesforce administrator."
@RegressionTest
    Scenario Outline: To validate the proper credit
      Given user should navigate to the salesforce application
      When user should enter the username"<UserName>" and password "<Password>"
      And user should clicks to the login button
      Examples:
      |UserName|Password|
      |Arun    |123    |
      |Ravi    |345    |
      |Abi     |907    |
@StaticDropDownTest
Scenario: To validate the swaglabs application
  Given user should navigate to the homepage swaglaps applications
  When user should enter the username and password
  Then user should clicks the login button and clicks to the dropdown name dropper

@sampleTest
Scenario: To validate the spicejet application
  Given user should navigate to the home page
  When user select to the currency dropdown and aed value
@AdultTest
  Scenario: To validate the adult dropdown
    Given user navigate to the spicejet application
    When user clicks the passenger option
    Then user select to the adult option
@ChildTest
  Scenario: To validate the child passenger dropdown
    Given user navigate to the spicejet application
    When user clicks the passenger option
    Then user select to the child option
@BabyTest
 Scenario: To validate the all dropdown
  Given user navigate to the amazon page
  When user select to the all option
  Then user clicks to the baby option
@FromTest
 Scenario: To validate the travel book application
  Given user should navigate to the home page
  When user clicks to the from search box
  And user clicks from search box on pass to the value
  Then user passed value to arrowdown on the below option
@AmazonDropTest
Scenario: To validate the all dropdown
  Given user navigate to the amazon page
  When user select to the all option
  And user extract to the all dropdown values

  Scenario: To validate to the from and to city
    Given user navigate to the spicejet application
    When user select to the from and chennai
    And user select to the to option

  Scenario: To validate to the mouse action signout page
    Given user should navigate to the home page
    When user select to the sign in button
    Then user clicks to the signout button
 @StringTest
 Scenario: To validate to the string pass
   Given user should navigate to the home page
   And user clicks to the search box
   When user enter the briy text
@TableHandling
Scenario: To validate the cricbuzz score card
  Given user should navigate to the home page
  When user select to the score table
@Calender
Scenario: To validate the calender box
  Given user should navigate to the home page
  When user select to the calender icon
  Then user select to the first table
  And user select to the date
 @HandleCalender
Scenario:To validate the spicejet application of calender icon fron second table
   Given user should navigate to the home page
   When user select to the calender icon
   Then user select to the second table
   And user clicks to the next icon and select to the august month and date
@Hyperlinks
Scenario:To validate the selenium dev application
  Given user should navigate to the home page
  When user counts to the hyperlinks
  Then user counts to the company frame
@Amazonlink
Scenario: To validate the amazon links
  Given user should navigate to the home page
  When user counts to the amazon hyperlinks
@Amazonsearch
Scenario: To validate the amazon
  Given user should navigate to the home page
  When user search the products
@TableClick
Scenario: To validate to the tables
  Given user should navigate to the home page
  When user select the tables













