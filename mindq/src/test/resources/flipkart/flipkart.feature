Feature: Login
@smoketest
Scenario: validate site launching
Given launch site using "chrome"
Then title contains "Online Shopping"
And close site
Scenario: login and logout
Given launch site  using "chrome"
When do login with "srikanth.vale148@gmail.com" and "9030110016"
And do logout
And close site
