Feature: Add a language

    @adminAddLang
Scenario: add a language
    When user enters admin username and password
    And clicks on login button
    Then user is successfully logged in
    When user navigates to Admin option
    And user clicks on languages from qualifications menu
    Then user is navigated to the language page
    When user clicks on add language button
    And user enters a name of a language and saves
    Then user has successfully added a language


