Feature: The user fill the customer detail
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given The user into the add customer page
    When The user fill the valid customer ID detail
      | fname   | arul                |
      | lname   | murugan             |
      | email   | shdbjyagd@gmail.com |
      | address | jgdfja              |
      | phnum   |              124899 |
    When The user click the submit button
    Then The user check the correct User genrated ID formate
