

@smoke @regerrsion
Feature: The User check with an scenario outline page
  I want to use this template for my feature file
@user1
  Scenario Outline: Title of your scenario outline
    Given The user is in add triff paln page
    When The user fill the valid detail "<MonthRent>","<LocalMin>","<InterMin>","<SmsPack>","<PerMin>","<MinuteCharge>","<PerCharge>"
    When The user click the submit button in add triff plan
    Then the user should see the success message

    Examples: 
      | MonthRent | LocalMin | InterMin | SmsPack | PerMin | MinuteCharge | PerCharge |
      |       500 |      200 |      400 |     250 |    350 |          550 |       100 |
      |       400 |      200 |      700 |     250 |    850 |          550 |       100 |
      |       900 |      200 |      300 |     250 |    550 |          550 |       600 |

      @user2
        Scenario Outline: Title of your scenario outline
    Given The user is in add triff paln page
    When The user fill the valid detail "<MonthRent>","<LocalMin>","<InterMin>","<SmsPack>","<PerMin>","<MinuteCharge>","<PerCharge>"
    When The user click the submit button in add triff plan
    Then the user should see the success message

    Examples: 
      | MonthRent | LocalMin | InterMin | SmsPack | PerMin | MinuteCharge | PerCharge |
      |       500 |      200 |      400 |     250 |    350 |          550 |       100 |
      |       400 |      200 |      700 |     250 |    850 |          550 |       100 |
      |       900 |      200 |      300 |     250 |    550 |          550 |       600 |
      
      
      @user3
        Scenario Outline: Title of your scenario outline
    Given The user is in add triff paln page
    When The user fill the valid detail "<MonthRent>","<LocalMin>","<InterMin>","<SmsPack>","<PerMin>","<MinuteCharge>","<PerCharge>"
    When The user click the submit button in add triff plan
    Then the user should see the success message

    Examples: 
      | MonthRent | LocalMin | InterMin | SmsPack | PerMin | MinuteCharge | PerCharge |
      |       500 |      200 |      400 |     250 |    350 |          550 |       100 |
      |       400 |      200 |      700 |     250 |    850 |          550 |       100 |
      |       900 |      200 |      300 |     250 |    550 |          550 |       600 |
      
      
        Scenario Outline: Title of your scenario outline
    Given The user is in add triff paln page
    When The user fill the valid detail "<MonthRent>","<LocalMin>","<InterMin>","<SmsPack>","<PerMin>","<MinuteCharge>","<PerCharge>"
    When The user click the submit button in add triff plan
    Then the user should see the success message

    Examples: 
      | MonthRent | LocalMin | InterMin | SmsPack | PerMin | MinuteCharge | PerCharge |
      |       500 |      200 |      400 |     250 |    350 |          550 |       100 |
      |       400 |      200 |      700 |     250 |    850 |          550 |       100 |
      |       900 |      200 |      300 |     250 |    550 |          550 |       600 |
      