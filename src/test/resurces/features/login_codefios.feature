
@tag
Feature: user be able to login with valid credintial from databaase
  

  @tag1
  Scenario:1 user login with valid user id and password 
    Given user is on loginpage 
  
    When user enter user name as "username" from database
    When user enter user passsword as "password" from database
    When en user is able to click login button 
		When user is able to landed on dash bord and able to click on list account
		When user is able to land on add account page and able to click on add button
		When user is able to enter the account information
		When user is able to save information
		Then user is able to valid account in list account
   
