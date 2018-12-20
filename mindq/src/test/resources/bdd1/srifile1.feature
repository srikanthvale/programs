Feature: Logout

Scenario: validate logout operation
Given launch site using "chrome"
When do login with valid data
|mbno      |pwd |
|9030110016|1234|
And do logout
Then home page will be reopened 
And close site