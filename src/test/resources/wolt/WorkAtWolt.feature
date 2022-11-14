Feature: Request a work contact

  @form
  Scenario: Request a work contact with correct data
    Given I am on the Work at Wolt page
    When I enter following details
      | test@mail.com | Instafright | 2-10 | Germany |

    And I click on Sign op free button
    Then I see the title
    """
    Sign up for Wolt at Work
    """
