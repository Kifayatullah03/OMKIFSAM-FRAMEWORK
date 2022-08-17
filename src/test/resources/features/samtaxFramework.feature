Feature:
  Scenario:
    Given user navigate to url http://automationpractice.com/index.php
    When user click on sign in link button
    And user enter email address in 'Create and account ' section
    And user click on create Account button
    And user enter the personal information ,Address adn contact info
    And user click on register button
    Then user  Validate that user is created.