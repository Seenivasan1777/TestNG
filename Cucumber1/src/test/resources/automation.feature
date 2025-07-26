
Feature: To Validate food ordering process of bisto bites web application


  @tag1
  Scenario: To validate login functionality by using  invalid username and password in bisto bites web application 
    Given To launch the browser
    When To launch URL of bisto bites Web application
    And To click the account button
    And To pass data to phone text field
    And To pass data to password text field
    And To click login button
    Then To close the browser
    
    @tag2
   Scenario: To validate add the dosa in food list and checking te available time
   Given To launch the browser
    When To launch URL of bisto bites Web application
    And To click the Dosa dropdown
    And To Click the Masal Dosa option
    And To check available Time
    
    
      @tag3
    Scenario: To validate the signup functionality by giving invalid confirm password
     Given To launch the browser
     When To launch URL of bisto bites Web application
     And To click the account button
    And To Pass different data  to confirm password text field
    And To click the register button
   
    
    @tag4
    Scenario: To validate the search function and checking the price
      Given To launch the browser
     When To launch URL of bisto bites Web application
     And To pass data coke to search text field
     And To click the search button
     And To print the price of the coke can
    
     
     @tag5
     Scenario: To validate probability functionality of food item Spanish omelet
     Given To launch the browser
     When To launch URL of bisto bites Web application
     And To pass data spanish omelet to search text field
     And To click the search button
     And To click the food item spanish omelet
     And To click all the extra toppings and checks the price
     
     
     @tag6
     Scenario: To validate spelling check for our story text
       Given To launch the browser
     When To launch URL of bisto bites Web application
     And To click the our story tag on the home page
     And To Print the text from our story
     Then To close the browser

     
