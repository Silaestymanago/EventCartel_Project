Feature: This feature is responsible for Popup Log ni Avatar functionality testing

  Scenario Outline: Check that the button Credits open the page Credits and has title v and column Account credits
    Given Customer open Home Page
    When Guest click on the user button
    And Guest enter "<Email>"
    And Guest enter"<Password>"
    And Guest log in button click in the form registration
    And Customer click on the button log in on the Home page
    And Customer click on the Credits field in the popup Log in
    Then "<Title>" is on the page
    Then "<Column>" is on the page Credits

    Examples:
      | Email                | Password  | Title            | Column           |
      | admin@rusangeles.com | Aivai4oo1 | Credits Activity | Account Settings |


  Scenario Outline: Check that the user is Kate Halenko is on the Messenger Page
    Given Customer open Home Page
    When Guest click on the user button
    And Guest enter "<Email>"
    And Guest enter"<Password>"
    And Guest log in button click in the form registration
    And Customer click on the button log in on the Home page
    And Customer click on the Messages field on the popup logIn
    And Customer click on the user name
    Then User messenger has "<User Name>"

    Examples:
      | Email                | Password  | User Name    |
      | admin@rusangeles.com | Aivai4oo1 | Kate Halenko |


  Scenario Outline: Check that it is possible to set the desired city
    Given Customer open Home Page
    When Customer click on the button Browse Events
    And Customer click on the button All Cities
    And Customer click on the button city
    Then Check that the selected "<City Name>" is indicated correctly on the navigation button

    Examples:
      | City Name |
      | Boston    |

  Scenario Outline: Check the Button My Ticket open page Your Tickets
    Given Customer open Home Page
    When Guest click on the  button My Tickets
    And Guest enter "<Email>"
    And Guest enter"<Password>"
    And Guest click on the LogIn button in the form registration
    Then Check Title the page has "<Title>"

    Examples:
      | Email                | Password  | Title        |
      | admin@rusangeles.com | Aivai4oo1 | Your Tickets |

  Scenario Outline: Check that hte button Help open the page How can we help?
    Given Customer open Home Page
    When Customer click on the button Help
    Then Check that the button Help open the page with "<Title>"
   Examples:
    |Title|
    |How can we help?|


