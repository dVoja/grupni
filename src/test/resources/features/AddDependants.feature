Feature: Add dependents
  @dependents
  Scenario: add dependents to employee profile
    When user enters employee username and password
    And navigates to dependents section
    Then field should be clickable
    And employee can add multiple dependents
        |name     |relationship     |DOB        |
        |Ana B    |Child            | 2024-02-01|
        |Ella A   |Child            |2024-12-01 |
    Then employee should be able to edit dependents
