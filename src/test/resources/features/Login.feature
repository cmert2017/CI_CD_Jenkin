Feature: Login feature
    As a User I want to login to be able to see the dashboard

  Scenario:  Basic login
    Given User is on the landing page
    When user enter credentials
    And user clicks login button
    Then user suppose to see welcome message