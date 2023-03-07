Feature: As a user, I should be able to send simple text messages using the message tab.

  @US5
  Scenario Outline: Users send text messages successfully
    Given Users go to the login page
    When  Enter valid "<email>" and "<password>"
    When  Click the LoginIn button
    When  Users click the "MESSAGE" tab
    When  Users write test message
    When  Users click the SEND button
    When  Verify the message is displayed on the feed

    @US5
    Examples:
      |   email               |   password  |
      |  hr1@cydeo.com        |   UserUser  |
#      |  hr2@cydeo.com        |   UserUser  |
#      |  hr3@cydeo.com        |   UserUser  |
#      |  helpdesk1@cydeo.com  |   UserUser  |
#      |  helpdesk2@cydeo.com  |   UserUser  |
#      |  helpdesk3@cydeo.com  |   UserUser  |
#      |  marketing1@cydeo.com |   UserUser  |
#      |  marketing2@cydeo.com |   UserUser  |
#      |  marketing3@cydeo.com |   UserUser  |