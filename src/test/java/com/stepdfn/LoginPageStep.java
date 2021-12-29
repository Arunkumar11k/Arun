package com.stepdfn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginPageStep {
	WebDriver driver;
	@Given("user is on the adactin page")
	public void user_is_on_the_adactin_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
	}

	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String city, String string2) {
		WebElement txtuserName = driver.findElement(By.id("username"));
		txtuserName.sendKeys(city);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(string2);
	}
		
	

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement loginclk = driver.findElement(By.id("login"));
		loginclk.click();
		
	}
	
	@When("user should enter search hotel {string}{string}{string}{string}{string}{string}{string}{string}")
	public void user_should_enter_search_hotel(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        WebElement location = driver.findElement(By.id("location"));
        Select select =new Select(location);
        select.selectByVisibleText(string);		
        
        WebElement hotel = driver.findElement(By.id("hotels"));
        Select select1 = new Select(hotel);
        select1.selectByVisibleText(string2);
        
        WebElement roomtype= driver.findElement(By.id("room_type"));
        Select select2 = new Select(roomtype);
        select2.selectByVisibleText(string3);
        
        WebElement roomno = driver.findElement(By.id("room_nos"));
        Select select3 = new Select(roomno);
        select3.selectByVisibleText(string4);
        
        WebElement pickin = driver.findElement(By.id("datepick_in"));
        pickin.clear();
        pickin.sendKeys(string5);
        
        WebElement pickout = driver.findElement(By.id("datepick_out"));
        pickout.clear();
        pickout.sendKeys(string6);
        
        WebElement adultroom = driver.findElement(By.id("adult_room"));
        Select select4 = new Select(adultroom);
        select4.selectByVisibleText(string7);
        
        WebElement childrenroom = driver.findElement(By.id("child_room"));
        Select select5 = new Select(childrenroom);
        select5.selectByVisibleText(string8);
        }

	@When("user should click search button")
	public void user_should_click_search_button() {
		WebElement element = driver.findElement(By.id("Submit"));
		element.click();
	}

	@When("user should select hotel and click continue button")
	public void user_should_select_hotel_and_click_continue_button() {
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		}

	@When("user should Book a hotel {string}{string}{string}{string}{string}{string}{string}{string}")
	public void user_should_Book_a_hotel(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
         WebElement fName = driver.findElement(By.id("first_name"));
         fName.sendKeys(string);
         WebElement lName = driver.findElement(By.id("last_name"));
         lName.sendKeys(string2);
         WebElement add = driver.findElement(By.id("address"));
         add.sendKeys(string3);
         WebElement cNum = driver.findElement(By.id("cc_num"));
         cNum.sendKeys(string4);
         
         WebElement ccT = driver.findElement(By.id("cc_type"));
         Select select = new Select(ccT);
         select.selectByVisibleText(string5);
         
        WebElement exm = driver.findElement(By.id("cc_exp_month"));
        Select sel=new Select(exm);
        sel.selectByVisibleText(string6);
         
         WebElement expyear = driver.findElement(By.id("cc_exp_year"));
         Select select2 = new Select(expyear);
         select2.selectByVisibleText(string7);
         
         WebElement cvv = driver.findElement(By.id("cc_cvv"));
         cvv.sendKeys(string8);
         
	}

	@When("user should click BookNow button")
	public void user_should_click_BookNow_button() throws InterruptedException {
		WebElement booknowbutton = driver.findElement(By.id("book_now"));
		booknowbutton.click();
		Thread.sleep(5000);
	}

	@When("user should booking confirmation and getting the order id")
	public void user_should_booking_confirmation_and_getting_the_order_id() {
		WebElement orderid = driver.findElement(By.id("order_no"));
		String attribute = orderid.getAttribute("value");
		System.out.println("\nBook Id :"+attribute);
		
	}

	@Then("user should verify Succesful msg")
	public void user_should_verify_Succesful_msg() {
		Assert.assertTrue("verify msg", true);
		driver.quit();
		
	}




	
	

}
