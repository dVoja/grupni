Feature: Add Work Experience as Employee
  @workexp
  Scenario: Adding Work Exp

    When user enters employee username and password
    Then navigate to work experience section
    And check are fields editable
    Then validate mandatory fields are entered before saving work experience
    And employee can edit work previously entered work experience
