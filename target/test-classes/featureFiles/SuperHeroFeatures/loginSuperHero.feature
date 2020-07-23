Feature: Super Hero login Page Functionality
  As user, I want to be able to login to page

  @test1235
  Scenario: SuperHero Login page
    When user open login page
    Then user enter emails and password
    And user verifies the title of home page
    And user navigate home link and verify the title