Feature: The User check with an scenario outline page
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given The user is in add triff paln page
    When The user fill the valid detail "<MonthRent>","<LocalMin>","<InterMin>","<SmsPack>","<PerMin>","<MinuteCharge>","<PerCharge>"
    When The user click the submit button in add triff plan
    Then the user should see the success message

    Examples: 
      | MonthRent | LocalMin | InterMin | SmsPack | PerMin | MinuteCharge | PerCharge |
      |       500 |      200 |      400 |     250 |    350 |          550 |       100 |
