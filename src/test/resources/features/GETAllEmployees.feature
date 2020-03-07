Feature: Validating Syntax /getOneEmployee.php HRMS API
Background:
Given user generates token

#This is the only homework Assignment
@SyntaxHRMSAPIEndToEnd22
Scenario: Retrieving AllEmployee using /getAllEmployee.php API
Given user calls getAllEmployees to retrieve all employee
When User retrieves response for getAllEmployees to retrieve List of employees
Then status code is 200
Then user validates List of Employees is successfully Returned