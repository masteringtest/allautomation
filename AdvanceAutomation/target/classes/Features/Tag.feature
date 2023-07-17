#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@MustRun
Feature: Learning multiple tags

  @SmokeTesting
  Scenario: Performing mouse hover
    Given
    When
    And
    Then 

  @RegressionTesting
  Scenario: Checking older functionalities after adding few new requirements
    Given 
    When
    And
    When
    And
    Then 

   @HomePage
   Scenario: Checking HomePage requirements
    Given 
    When
    And
    Then
 
 Feature: SwagLabs