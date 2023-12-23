Feature:Testing the Functionality of DemoBlaze login Screen

@done1 @Testcase1
Scenario: DemoBlaze Website launches on Browser
Given User launches the Browser
When User opens DemoBlaze URL
Then DemoBlaze Website should be launched
And Related links should be present
And close the Browser

@done @Testcase2
Scenario: User does Successful Registration
Given User launches the Browser
When User opens DemoBlaze URL
Then Upon clicking Sign In link Sign In Alert opens
And On providing username and password Registration should happen
And close the Browser

@done @Testcase3
Scenario: Happy Path for Login
Given User launches the Browser
And User opens DemoBlaze URL
When user Attemps to Login with "username" and "password"
Then verify Welcome message is displayed
And close the Browser

@happy @Testcase4
Scenario: Negative Test for Login
Given User launches the Browser
And User opens DemoBlaze URL
When user Attemps to Login with Incorrect credentials
Then verify Incorrect user message is displayed
And close the Browser
