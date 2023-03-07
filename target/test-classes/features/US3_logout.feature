Feature: successfully logout

  @logout
  Scenario Outline: As a user, I should log out from the NextBaseCRM app
    Given Users go to the login page
    When  Enter valid "<email>" and "<password>"
    When  Click the LoginIn button
    When Users click the user profile name
    And  Users select the "Log out" option
    Then Verify the user back to the login page

    @logout
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