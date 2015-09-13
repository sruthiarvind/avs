Feature: One way flight
  As a end user 
  I want to be able to search for one way  flights
  So that i can view all flights

  Scenario Outline: Search for one way flights with default dates and passengers
    Given I am on homepage
    When I seach for flight from "<origin>" to "<destination>"
    Then I see some related flight details

    Examples: 
      | origin                             | destination                               |
      | London, England, UK (LHR-Heathrow) | Hyderabad, India (HYD-Rajiv Gandhi Intl.) |
