Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: user to validate the error message
    Given the user is in add customer page
    When the user fill the valid customer valid detail
      | arul | murugan | bfbte@gmail.com | chennai | 78916845 |
    When the user click the submit button
      | Numbers are not allowed |
    Then the user should see the customer id genrated
