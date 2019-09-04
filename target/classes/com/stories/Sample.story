Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  The scope of this test  is to open BVD  screen 
Given I open a browser
When I enter http://15.114.95.152:4004/dashboard
Then Login screen is displayed 

Scenario : The scope of this test is to login to BVD
Given BVD login screen is open 
When I enter username , password an click on login
Then The BVD dashboard should deisplay 
