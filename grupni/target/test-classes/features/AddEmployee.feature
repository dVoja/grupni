Feature: Add employee in HRMS application

  Background:
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add Employee option
  @addEmployeeByName @addEmployee
  Scenario: Adding an employee by providing first name and middle name and last name
    When user enters a first name and middle name and last name
    And user clicks on a save button
    Then user successfully added employee by providing first name and middle name and last name
  @addEmployeeById @addEmployee
  Scenario:Adding an employee by providing unique id
    When user enters "<first name>", "<middle name>", "<last name>" and "<employee ID>" and clicks on save
    Then user successfully added employee by providing employee ID
  @submitEmployeeInfo @addEmployee
  Scenario: Submit incomplete employee information
    When user submits incomplete employee information
    And user clicks on save button
    Then user should see "Required" near the respective input fields
