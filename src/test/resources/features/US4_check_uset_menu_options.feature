Feature:  Users view all options under the profile

  @US4
  Scenario Outline: Users view all options under the profile
    Given Users go to the login page
    When  Enter valid "<email>" and "<password>"
    When  Click the LoginIn button
    When Users click the user profile name
    Then  Verify the users see:
      | Themes                  |
      | My Profile              |
      | Edit Profile Settings   |
      | Configure notifications |
      | Log out                 |

    @US4
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