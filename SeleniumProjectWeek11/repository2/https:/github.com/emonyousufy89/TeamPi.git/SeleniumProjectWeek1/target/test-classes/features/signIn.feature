#
#Feature: Login Feature
  #As a QE I want to test Login Feature of USPS
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #
  #Scenario Outline: Successful login with valid username and password
    #Given customer is on Homepage
    #When Customer clicks SignIn link on the top of homepage
    #And Customer enters "<username>" and Customer enters "<password>"
    #And Custoemr clicks sign in
    #Then Homepage should be shown
#
    #Examples: 
      #| username         | password    |
      #| MahbubaNimme2020 | Corona2020  |
      #| QA2020           | Corona2020 |
#
  #@tag2
  #Scenario Outline: Successful login with valid username and password
    #Given customer is on Homepage
    #Then Customer clicks SignIn link on the top of homepage
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
