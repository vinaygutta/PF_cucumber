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
@Alerts
Feature: To verify alerts

  @TC1
  Scenario: Title of your scenario
    Given when clicked on AlertsFrameWin link on the Home page
    And clicked on Alerts link on the left nav
    When when clicked on click me button related to alert
    Then alert should be displayed

  @TC2
  Scenario: Checked delayed alert
    Given when clicked on AlertsFrameWin link on the Home page
    And clicked on Alerts link on the left nav
    When when clicked on click me button related to delayed alert
    Then alert should be displayed
