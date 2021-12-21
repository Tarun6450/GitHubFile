package com.stepdefinition;

import org.demo.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination extends LibGlobal {
	@Given("User is on Login page of Adactin")
	public void user_is_on_Login_page_of_Adactin() {

		getDriver();
		loadUrl("https://adactinhotelapp.com/index.php");

	}

	@When("User shoud enter User {string} and password {string}.")
	public void user_shoud_enter_User_and_password(String userName, String password) {

		WebElement txtUserName = findElementById("username");
		type(txtUserName, userName);

		WebElement txtPassword = findElementById("password");
		type(txtPassword, password);

	}

	@When("User click ok on the login page once entered Password.")
	public void user_click_ok_on_the_login_page_once_entered_Password() {
		WebElement btnLogin = findElementById("login");
		click(btnLogin);

	}

	@When("User should search Hotel with {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}.")
	public void user_should_search_Hotel_with_and(String Location, String Hotel, String RoomType, String NumberOfRoom,
			String CheckInDate, String CheckOutDate, String AdultsPerRoom, String ChildrenPerRoom) {

		WebElement location = findElementById("location");

		WebElement hotels = findElementById("hotels");

		WebElement roomType = findElementById("room_type");

		WebElement roomNos = findElementById("room_nos");

		WebElement checkInDate = findElementById("datepick_in");

		WebElement checkOutDate = findElementById("datepick_out");

		WebElement adultRoom = findElementById("adult_room");

		WebElement childRoom = findElementById("child_room");

		selectoptionsByText(location, Location);

		selectoptionsByText(hotels, Hotel);
		selectoptionsByText(roomType, RoomType);
		selectoptionsByText(roomNos, NumberOfRoom);

		checkInDate.clear();
		type(checkInDate, CheckInDate);

		checkOutDate.clear();
		type(checkOutDate, CheckOutDate);
		selectoptionsByText(adultRoom, AdultsPerRoom);
		selectoptionsByText(childRoom, ChildrenPerRoom);

	}

	@When("User Should click search button.")
	public void user_Should_click_search_button() {

		WebElement search = findElementById("Submit");
		click(search);
	}

	@When("User should select Hotel and Continue.")
	public void user_should_select_Hotel_and_Continue() {

		WebElement rdBtnSelectHotel = findElementById("radiobutton_0");

		WebElement btnContinue = findElementById("continue");

		click(rdBtnSelectHotel);

		click(btnContinue);
	}

	@When("User should book a hotel with details {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}.")
	public void user_should_book_a_hotel_with_details_and(String FirstName, String LastName, String Address,
			String CreditCardNo, String CreditCardType, String ExpiryMonth, String ExpiryYear, String CVVNumber) {

		WebElement txtFirstName = findElementById("first_name");
		WebElement txtLastName = findElementById("last_name");
		WebElement txtAddress = findElementById("address");
		WebElement txtCardNumber = findElementById("cc_num");

		WebElement ddnCardType = findElementById("cc_type");

		WebElement ddnCardExpiryMonth = findElementById("cc_exp_month");

		WebElement ddnCardExpiryYear = findElementById("cc_exp_year");
		WebElement txtCvvNumber = findElementById("cc_cvv");

		type(txtFirstName, FirstName);
		type(txtLastName, LastName);

		type(txtAddress, Address);

		type(txtCardNumber, CreditCardNo);

		selectoptionsByText(ddnCardType, CreditCardType);

		selectoptionsByText(ddnCardExpiryMonth, ExpiryMonth);

		selectoptionsByText(ddnCardExpiryYear, ExpiryYear);

		type(txtCvvNumber, CVVNumber);

	}

	@When("User click booknow button.")
	public void user_click_booknow_button() throws InterruptedException {

		WebElement btnSearch = findElementById("book_now");
		click(btnSearch);
		Thread.sleep(5000);
	}

	@Then("get Order ID and print in Console and close browser.")
	public void get_Order_ID_and_print_in_Console_and_close_browser() throws InterruptedException {
		WebElement orderId = findElementById("order_no");
		
		String txtorderId = getAttribute(orderId);
		System.out.println("Order ID"+txtorderId);
		Thread.sleep(5000);
		closeCurrentBrowser();
	}

}

