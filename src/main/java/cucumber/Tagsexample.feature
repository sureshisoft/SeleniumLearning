
@irctclogin
Feature:Verify the Tag scenario
Scenario: user should validate the Tag scenario for irctc booking
Given user enter username and password
When After giving irctc url in browser and then username and password
Then login should be made sucessfull.

@irctcsearch
Scenario: user should be search the train details 
Given user select the train Place Date of journey 
When Click on Search button 
Then Seats avaialable should be shown

