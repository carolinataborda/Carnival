Feature: Validate itinerary information and booking
  As a user
  I want choose one sail
  to learn more about the trip

  Background:
    Given  i enter the url "Carnival"

  @ValidateItineraryPage
  Scenario Outline: Validate the itinerary page should be displayed
    When select sail to the Bahamas and duration between six and nine days
    And I select any result
    Then I should the itinerary page of the selected cruise
    And I should see information about each <day>
    And I should see a BOOK NOW button

    Examples:
    |day|
    |Day 1 Baltimore depart 5:00 PM|

