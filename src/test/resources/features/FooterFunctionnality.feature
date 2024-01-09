Feature: This feature is responsible for footer functionality testing

 Scenario Outline: Check that the button Support Chat open popup Help
    Given Customer open Home Page
    When Customer click on the button Support Chat
    Then "<Popup>" open

   Examples:
   |Popup|
   |Help |

Scenario Outline: Check that the language changes correctly
     Given Customer open Home Page
     When Customer click on the button language
     And Customer click button RU
     Then Check that the "<Title Home Page>" translate into russian

    Examples:
    |Title Home Page|
    |ВАШ БИЛЕТ НА ПРЯМЫЕ ТРАНСЛЯЦИИ|