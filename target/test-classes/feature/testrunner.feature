@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: The user run with test runner
    Given The user is in Add triff plan page
    When the user fill the valid customer Id "<MonthRent>","<LocalMin>","<InterMin>","<SmsPack>","<PerMin>","<MinuteCharge>","<PerCharge>"
    When the user click the submit button in add triff plan
    Then the user should be in customer Id genrator

    Examples: 
      | MonthRent | LocalMin | InterMin | SmsPack | PerMin | MinuteCharge | PerCharge |
      |       500 |      200 |      400 |     250 |    350 |          550 |       100 |
      |       500 |      200 |      800 |     250 |    650 |          550 |       100 |
      |       800 |      200 |      400 |     750 |    350 |          550 |       100 |
