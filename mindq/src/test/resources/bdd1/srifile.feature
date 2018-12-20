Feature: Login

Scenario: validate site launching
Given launch site using "chrome"
Then title contains "Free SMS"
And close site

Scenario Outline: validate login operation
Given launch site using "chrome"
When enter mobile number as "<x>"
And enter password as "<y>"
And click login
Then validate output for criteria "<z>"
And close site
Examples:
|    x     | y  |    z     |
|9030110016|1234|all_valid |
|          |1234|mbno_blank|
|9030110016|    |pwd_blank |
|90301100  |1234|mbno_invalid|
|9030110016|5678|pwd_invalid|


