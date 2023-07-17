#Author: Pooja Shrivastava
#Date: 04th July 2023
#Description: Testing SwagLabs application
Feature: Feature to test login functionality

	@ValidCrendential
  Scenario: Testing Login functionality with valid credentials
    Given User is on login page
    When User enters username and password
    And Click on login button
    Then User is navigating to Home Page

  @DDT
  Scenario Outline: Testing Login functionality with DDT
    Given User is on login page
    When User enters <username> and <password>
    And Click on login button
    Then User is navigating to Home Page

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |