@homepage
  Feature: DarkSky Weather Check
    Scenario: Weather Check
      Given I am on the Home Page
      When I enter correct location in the location field
      Then I see the lowest and highest temp