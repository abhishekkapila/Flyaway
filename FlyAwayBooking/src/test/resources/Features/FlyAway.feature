@tagItems
Feature: Booking tickets through FlyAway
I want to use this template for my feature file

@tag1
Scenario: Navigate home page
Given user has opened Application
When user opens Home page
Then user should be navigated to home page

@tag2
Scenario: User Performs the login
Given user has opened login/signup page
And user opts to login
When user enters details required
Then user has been logged in

@tag3
Scenario: User selects the flight
Given user choosed source and destination of the flight 
When user clicks on submit button to see the flights 
Then user is able to see tha available flights
@tag4
Scenario: User books the flight
Given user clicks on the book flight 
When user is on payment page clicks on complete booking
Then user is able to see the booked flights
@tag5
Scenario: rest
Given rest 
When user the request is done
Then user shoulld be able to see bookings 

