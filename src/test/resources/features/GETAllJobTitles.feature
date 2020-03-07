Feature: Validating Syntax /updateEmployee.php HRMS API
Background:
Given user generates token
@SyntaxHRMSAPIEndToEnd22
Scenario: Retriving all Job Titles using /jobTitle.php API
Given user calls jobTitle API to retrieve all job titles
When User retrieves response for jobTitle API to retrieve all Job Titles
Then status code is 200 for jobTitle API
Then user validates Job Titles