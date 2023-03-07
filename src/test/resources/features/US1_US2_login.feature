Feature: Successful login

  @success
  Scenario Outline:
    Given Users go to the login page
    When  Enter valid "<email>" and "<password>"
    When  Click the LoginIn button
    Then  Verify users log in successfully and launch the homepage and see "Portal"

  @success
  Examples:
    |   email               |   password  |
    |  hr1@cydeo.com        |   UserUser  |
    |  hr2@cydeo.com        |   UserUser  |
    |  hr3@cydeo.com        |   UserUser  |
    |  helpdesk1@cydeo.com  |   UserUser  |
    |  helpdesk2@cydeo.com  |   UserUser  |
    |  helpdesk3@cydeo.com  |   UserUser  |
    |  marketing1@cydeo.com |   UserUser  |
    |  marketing2@cydeo.com |   UserUser  |
    |  marketing3@cydeo.com |   UserUser  |


  @unsuccess
  Scenario Outline:
    Given Users go to the login page
    When  Enter invalid "<email>" and "<password>"
    When  Click the LoginIn button
    Then  Verify users see "Incorrect login or password" on the page
    @unsuccess
    Examples:
      |   email               |   password   |
      |  hr1@cydeo.com        |   UserUser_  |
      |  hr2@cydeo.com        |   UserUser_  |
      |  hr3@cydeo.com        |   UserUser_  |
      |  helpdesk1@cydeo.com  |   UserUser_  |
      |  helpdesk2@cydeo.com  |   UserUser_  |
      |  helpdesk3@cydeo.com  |   UserUser_  |
      |  marketing1@cydeo.com |   UserUser_  |
      |  marketing2@cydeo.com |   UserUser_  |
      |  marketing3@cydeo.com |   UserUser_  |


  @checkbox
  Scenario:
    Given Users go to the login page
    When  Verify there is a "Remember me on this computer" message displayed
    Then  check the checkbox clickable

