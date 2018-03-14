Feature: Create Account, Search For Properties, Create Property Email Alerts & Sign Out

  Scenario: As a new user, I want to be able to create an account, be logged in, search For properties, create property email alerts & sign out
    Given I am on the Home Page
    And I click The Sign In icon
    And I click the Create Account icon
    And I see the Create Account form displayed
    And I enter my title  details
    And I enter my First Name details
    And I enter my Surname details
    And I enter my Email details
    And I enter my Password details
    And I enter my Password Confirmation details
    And I see the Rightmove can contact me with relevant properties, offers and news Consent Tick Box
    And I click the Create Account Button
    And I should be registered as a user
    And I click /Buy/
    And I click /Property for sale/
    And I see A Property Search form
    And I enter Property search criteria /London/
    And I click /Start Search/
    And I see an /Advanced Property Search form/
    And I choose a Location in the Location drop down box
    And I choose a number of miles radius in the Search Radius drop down box
    And I choose a minimum price amount in the minimum price range drop down box
    And I choose a maximum price amount in the maximum price range drop down box
    And I choose a /Nos. Of Bedroom/ in the minimum bedroom amount drop down box
    And I choose a  /Nos. Of Bedroom/ in the maximum bedroom amount drop down box
    And I choose /Houses/ in the Property type box
    And I choose an added period duration in the Added to site drop down box
    And I click the Find Properties Button
    And I see the Search Results page
    And I click the Create Alert Icon
    And I click  on /Instantly/
    And I click on / Every Three Days/ Alert
    And I click the Create Alert Button
    When I click on Rightmove Icon
    And I verify that My Three days Alert is correctly shown
    And I see the Sign Out Icon
    And I Click the Sign Out Icon
    Then I should be Signed Out
    
   
