Feature: This feature is responsible for Home page functionality testing

  Scenario Outline: Check that the user is successfully logged in
    Given Customer open Home Page
    When Guest click on the user button
    And Guest enter "<Email>"
    And Guest enter"<Password>"
    And Guest log in button click in the form registration
    And Customer click on the button log in on the Home page
    Then Check that the user"<NameUser>" is logged in
    Examples:
      |Email               |Password |NameUser|
      |admin@rusangeles.com|Aivai4oo1|Stephan Cartello|

  Scenario Outline: Check that the Home Page has a section Popular Events In
    Given Customer open Home Page
    Then Check that the section one has "<Title>"
    Examples:
      |Title|
      |Popular Events In|

  Scenario Outline: Check that the Home Page has a section Popular Tours
    Given Customer open Home Page
    Then Check that the section two has "<Title>"
    Examples:
      |Title|
      |Popular Tours|
