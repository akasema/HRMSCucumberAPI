<<<<<<< HEAD
Feature: Validating Syntax /updateEmployee.php HRMS API
Background:
Given user generates token
@SyntaxHRMSAPIEndToEnd22
Scenario: Retriving all Job Titles using /jobTitle.php API
Given user calls jobTitle API to retrieve all job titles
When User retrieves response for jobTitle API to retrieve all Job Titles
Then status code is 200 for jobTitle API
=======
Feature: Validating Syntax /jobTitle.php HRMS API
Background:
Given user generates token

@GETAllJobTitles
Scenario: Retrieving all Job Titles using /jobTitle.php API
Given user calls jobTitle API to retrieve all job titles
When User retrieves response for jobTitle API to retrieve all Job Titles 
Then status code is 200 for jobTitle API 
>>>>>>> fc9d7b0817f3ff83a8c552b50825b030fecbf901
Then user validates Job Titles