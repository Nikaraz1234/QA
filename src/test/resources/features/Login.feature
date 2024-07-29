Feature: Login User

  Scenario: User is able to login with valid credentials
    Given user enters valid email
    And user enters valid password
    When user clicks to the login button
    Then user is logged in successfully

  Scenario Outline: User is not able to login with invalid credentials
    Given user enters invalid email: <email>
    And user enters invalid password: <password>
    When user clicks to the login button
    Then error message is displayed

    Examples:
      | email                 | password |
      | nikaraz1234@gmail.com | nikanika1 |
      | dsads@gmail.com       | dasdsa   |
