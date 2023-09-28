Feature: Order and Payment Process

  Scenario:
    Given The users navigate to Cleverppc homepage
    When The users click the sign in button
    And  Enter the current e-mail and password
      | email  | something@gmail.com |
      | passwd | something           |
    And The users click the submit in button
    When The users click the dress button
    Then The users choose three diffirent clothes in this section
    When  The users click the buttons
      | proceedButton  |
      | proceedButton2 |

    Then  When  The users click the buttons
      | paypalButton     |
      | creditCardButton |
      | bankButton       |
