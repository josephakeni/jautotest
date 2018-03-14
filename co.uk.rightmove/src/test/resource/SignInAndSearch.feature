Feature: Existing User Sign In, Search For Properties, Create Property Email Alerts & Sign Out

  Background: As a registered user, I want to be able to sign in, search for properties, create alerts and sign out afterwards
    Given I am on the Home Page
    And I click The Sign In icon
    And I see a Sign In form displayed

  @SignIn
  Scenario Outline: 
    When I enter my email "<email>" details
    And I enter my password "<password>" details
    And I see the /Forgot your password?/ link is displayed
    And I see the /Keep me signed in on this device consent box/ is displayed below the sign in button
    And I click the Sign In Button
    And I see My Rightmove Icon
    And I click My Rightmove Icon
    And I should know that I am Signed in to my account successfully
    And I click /Rent/
    And I click / Property to rent/
    And I see A Property Search form
    And I enter Property search criteria /London/
    And I click /Start Search/
    And I see a /Advanced Property Search form/
    And I choose  Location in the Location drop down box
    And I choose  number of miles radius in the Search Radius drop down box
    And I choose  minimum price amount in the minimum price range drop down box
    And I choose  maximum price amount in the maximum price range drop down box
    And I choose  /Nos. Of Bedroom/ in the minimum bedroom amount drop down box
    And I choose   /Nos. Of Bedroom/ in the maximum bedroom amount drop down box
    And I choose Houses/ in the Property type box
    And I choose the added period duration in the Added to site drop down box
    And I click  Find Properties Button
    And I see a Search Results page
    And I click  Create Alert Icon
    And I click on /Instantly
    And I click  on /Every Seven Days/ Alert
    And I click Create Alert Button
    And I click the My Rightmove Icon
    And I verify that My Seven days Alert is correctly shown
    And I see a Sign Out Icon
    And I Click  Sign Out Icon
    Then I should now be Signed Out

    Examples: 
      | email            | password     |
      | domclive@aol.com | Londonbridge |
     # Details For RightMove Test | JohnMartin801@yahoo.com | London_bridge1 |
