Feature: workflow builder

#Scenario: DFDafe
#Given USER ON LOGIN PAGE df
#When i dnt knw
#Then Veriy new eligibilty created for next year

#@Regressiontest @Smoketest
#Scenario: DFDafee
#Given USER ON LOGIN PAGE dfee
#When i dnt knweee
#
#@Smoketest
#Scenario: DFDafeee
#Given USER ON LOGIN PAGE dfeeee
#When i dnt knweeeeeee


Scenario Outline: Create eligibility and run mh renewal batch job

Given create eligibilty "<ini>" and "<timeline>"
When user Run's MH Renewal Batch jobs in year "<MHbatchjobtimeline>"
Then Veriy new eligibilty created for next year


Examples:
	| ini      | timeline   |   MHbatchjobtimeline | 
	|  xyz.ini | 04/01/2017 |   02/10/2018         |
	
