package com.stepdef;


import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

	public static WebDriver driver;

	@Given("user has opened Application")
	public void user_has_opened_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\installables\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/FlyAway/");
		
		System.out.println("user has opened Application");
	}
	@When("user opens Home page")
	public void user_opens_home_page() {
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();		
		System.out.println("user opens Home page");
	}
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		System.out.println("user should be navigated to home page");
	}
	@Given("user has opened login\\/signup page")
	public void user_has_opened_login_signup_page() {
		driver.findElement(By.xpath("//a[normalize-space()='Login/Signup']")).click();
		
		System.out.println("user has opened login page");
	
	}
	@Given("user opts to login")
	public void user_opts_to_login() {
		System.out.println("user opts to login");
		
		}
	@When("user enters details required")
	public void user_enters_details_required() {
		driver.findElement(By.name("email_id")).sendKeys("user@user.com");
		driver.findElement(By.name("pwd")).sendKeys("user");
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
	
		System.out.println("user enters details required");
	}
	
	@Then("user has been logged in")
	public void user_has_been_logged_in() {
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		   
	 System.out.println("user has been logged in");
	}
	@Given("user choosed source and destination of the flight")
	public void user_choosed_source_and_destination_of_the_flight() {
		driver.findElement(By.xpath("//select[@name='source']")).sendKeys("B");
	       driver.findElement(By.xpath("//select[@name='destination']")).sendKeys("H");
	       
	        
	    System.out.println("user choosed source and destination of the flight");
	}
	@When("user clicks on submit button to see the flights")
	public void user_clicks_on_submit_button_to_see_the_flights() {
		 driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
			System.out.println("user clicks on submit button to see the flights");
	}
	@Then("user is able to see tha available flights")
	public void user_is_able_to_see_tha_available_flights() {
	 System.out.println("user is able to see tha available flights");
	}
	
	@Given("user clicks on the book flight")
	public void user_clicks_on_the_book_flight() {
		driver.findElement(By.xpath("//a[normalize-space()='Book Flight']")).click();
       
	
		System.out.println("user clicks on the book flight");
	}
	@When("user is on payment page clicks on complete booking")
	public void user_is_on_payment_page_clicks_on_complete_booking() {
		 driver.findElement(By.xpath("//a[normalize-space()='Click to complete booking']")).click();
	       
		
		System.out.println("user is on payment page clicks on complete booking");
	 }
	@Then("user is able to see the booked flights")
	public void user_is_able_to_see_the_booked_flights() {
		driver.findElement(By.xpath("//a[normalize-space()='See Your Bookings']")).click(); 
	System.out.println("user is able to see the booked flights"); 
	}
	

	
	


}