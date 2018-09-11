Feature: login functionality 

#Scenario: login
#Given USER ON LOGIN PAGE
#When ENTER "naveenk" AND "test@123"
#Then ON HOME PAGE

#Scenario Outline: login
#Given USER ON LOGIN PAGE
#When ENTER "<username>" AND "<password>"
#Then ON HOME PAGE
#
#Examples:
#   | username | password  |
#   | naveenk   | test@123 |
#   | tom   | test456 |


Scenario: login 
	Given USER ON LOGIN PAGE 
	When ENTER username AND password 
		| naveenk   | test@123 |
	Then ON HOME PAGE 
	
