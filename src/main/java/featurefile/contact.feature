Feature: contact functionality

Scenario Outline: contact function
Given USER ON LOGIN PAGE
When ENTER "<username>" AND "<password>"
Then ON HOME PAGE
And user moves to contact page
Then user enters "<firstname>" and "<lastname>" and "<position>"
Then browser is closed

Examples:
   | username | password  | firstname | lastname | position |
   | naveenk   | test@123 |   SWATI    |  SINGH   |  MANAGER  |