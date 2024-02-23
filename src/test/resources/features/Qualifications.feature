Feature: Qualifications

  Background:
    When user enters admin username and password and clicks on login button
    Then user is successfully logged in
    When user navigates to Admin option
    And user navigates to the Qualifications option
  @qual
  Scenario: add a skill
    When user clicks on skills from qualifications dropdown menu
    And user is navigated to the skills page
    Then user clicks on add button
    When user enters name and description and saves
    Then user has successfully added a skill

  @qual1
  Scenario: add a language
    When user clicks on languages from qualifications dropdown menu
    And user is navigated to the language page
    Then user clicks on add language button
    When user enters a name of a language and saves
    Then user has successfully added a language
  @qual
  Scenario: add a membership
    When user clicks on membership from qualifications dropdown menu
    And user is navigated to the membership page
    Then user adds membership my click on add button
    When user enters a name of a membership and saves
    Then user has successfully added a membership