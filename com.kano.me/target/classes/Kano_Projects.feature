Feature: Kano Projects Menu & Footer Contents Verification

@Kano_Projects
  Scenario: I want to check that the menus and footer contents are correct
    Given That I am On The Projects Page
    And I see World Link displayed
    And I see Make Link displayed
    And I see Shop Link displayed
    And I see Connected Kanos
    And I see Online Today
    And I see Lines of codes
    And I see Creations shared
    Then I know the Footer contents are correct
