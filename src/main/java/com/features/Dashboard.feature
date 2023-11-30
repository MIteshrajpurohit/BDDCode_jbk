Feature:WebSite

Scenario:Verify login
Given user should be on login page
When  user enter usernamepassword
Then  user will be on home page
@Mit
Scenario:Verify Dashboard
Given user should be on login page
When  user enter usernamepassword
Then  user should be logout 

Scenario:Verify Dashboard User page
Given user should be on login page
When  user enter usernamepassword
Then  user page should be open