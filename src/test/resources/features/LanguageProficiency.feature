Feature: Language proficiency details

  Background:
    When employee enters employee username and password
    And employee clicks on a login button
    Then employee is logged in
    When employee clicks on My Info options
    And employee clicks on Qualifications option
    Then employee navigates to the Language option

@addlang
  Scenario: Adding language proficiency details
    When user clicks on Add option
    And user selects a language option
    When user selects fluency option
    And user selects competency level
    When user clicks on a comment textbox
    Then user is able to enter additional details about language proficiency
    When user clicks save button
    Then user successfully added language proficiency

  @mandatoryLangFields @addlang
  Scenario: Validate that mandatory fields are filled in
    When employee fills in mandatory Language field
    And saves the language proficiency details without filling in Fluency and Competency fields
    Then the system should display 'Required' message near the respective input fields

  @storedLangProfDetails @addlang
  Scenario: Store the language proficiency details
    When user selects saved language proficiency details
    And user sees saved details in the language proficiency section
    Then system syccessfully stored language proficiency details

  @editLangprofDetails @addlang
  Scenario: Edit language proficiency details
    When user selects the previously saved language
    And user edits the language proficiency options
    Then the updated language proficiency details should be saved on employee's profile


  @deleteLangProfDetails @addlang
    Scenario: delete language proficiency details
    When user navigates to the saved language proficiency details section
    And user clicks on a checkbox next to the saved language
    And user clicks on a delete button
    Then user successfully deleted the language proficency details
