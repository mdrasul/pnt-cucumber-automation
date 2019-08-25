Feature: Verifying MultiCart Footer Section
As a taster of Multicart.com/demo
I want to see if the MultiCart Footer Section for Make money with us and Connect with is there

Background: 
Given I open browser "chrome"
And I browse to www.multicart.com
Scenario: Verifying MultiCart Footer Section 
Then I validate Make Money With Us in footer
And I validate Affiliates
And I validate Sellers is in the footer
And I validate Home is in the footers
And I validate Connect With Us in footer 
