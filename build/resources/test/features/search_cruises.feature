Feature: Validate search cruises to the Bahamas
  As as user
  I want to search cruises
  to the Bahamas

  Background:
    Given  i enter the url "Carnival"
  @ValidateFiltered
  Scenario: Validate that the cruises were displayed by assigned price
    When select sail to the Bahamas and duration between six and nine days
    |sail       | duration|
    |The Bahamas|6-9Days|
    And I select a price range using the slide bar
    Then I can see the results for the assigned price




