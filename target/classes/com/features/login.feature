Feature:WebSite
@M
Scenario:Verify login Page
Given user should be on login page1
Then  User should see Header txt on login page
@Login
Scenario Outline:Verify open Home page
Given user should be on login page1
When user enter "<username>" and "<password>"
Then user will be on home page

Examples:
|username|password|
|kiran@gmail.com|123456|
|mitesh@gmail.com|Test1234|
|Test@gmail.com|edsff|
 
