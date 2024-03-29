Feature: Login functionality

  @validLogin @adminLogin
  Scenario: Valid admin login
    #Given user is navigated to HRMS application
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in

    @validLogin @empLogin
    Scenario: Valid employee login
    #Given user is navigated to HRMS application
    When user enters employee username and password
    And user clicks on login button
    Then user is successfully logged in

  @error
  Scenario Outline: Validating the error message
    When user enters "<username>" and "<password>" and verify the "<errorMessage>"
    Examples:
      | username | password  | errorMessage |
      |admin     |vnddd      |Invalid credentials|
      |vvnnfnf   |Hum@nhrm123|Invalid credentials|
      |          |Hum@nhrm123|Username cannot be empty|
      |admin     |           |Password cannot be empty|