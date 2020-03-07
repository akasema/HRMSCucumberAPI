<<<<<<< HEAD

 Feature:	Albums
 @GoRest
 Scenario: GetAlbums
 When I provide the request data 
 And I make a call to albums API
 Then I validate that 200 is status code
 And I validate the response body 
 
=======
Feature: Albums

  @GoRest
  Scenario: GetAlbums 
    When I provide the request data
    And I make a call to albums API
    Then I validate that 200 is the status code
    And I validate the response body
>>>>>>> fc9d7b0817f3ff83a8c552b50825b030fecbf901
