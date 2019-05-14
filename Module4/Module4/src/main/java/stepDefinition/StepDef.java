package stepDefinition;

import org.junit.Assert;

import com.cg.model.Modules;
import com.io.pom.ConferenceRegistration;
import com.io.pom.PaymentDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	static ConferenceRegistration registration = null;
	static PaymentDetails paymentDetails = null;
	
	@Given("^user is registering$")
	public void user_is_registering() throws Throwable {
		Modules.setBrowser();
		Modules.setBrowserConfig();
		Modules.runTest();
		registration = new ConferenceRegistration(Modules.driver);
		paymentDetails = new PaymentDetails(Modules.driver);
	}

	@When("^title of page is conference registration$")
	public void title_of_page_is_conference_registration() throws Throwable {
		String title = Modules.driver.getTitle();
		Assert.assertEquals("Conference Registration", title);
	}

	@Then("^user enters first name$")
	public void user_enters_first_name() throws Throwable {
		registration.clickNext();
		registration.giveFirstName();
	}

	@Then("^user enters last name$")
	public void user_enters_last_name() throws Throwable {
		registration.clickNext();
		registration.giveLastName();
	}

	@Then("^user enters email$")
	public void user_enters_email() throws Throwable {
		registration.clickNext();
		registration.giveEmail();
	}

	@Then("^user enters contact number$")
	public void user_enters_contact_number() throws Throwable {
		registration.clickNext();
		registration.giveContact();
	}

	@Then("^user selects no of people$")
	public void user_selects_no_of_people() throws Throwable {
		registration.clickNext();
		registration.giveNoOfPeople();
	}

	@Then("^user enters building name and room no$")
	public void user_enters_building_name_and_room_no() throws Throwable {
		registration.clickNext();
		registration.giveBuildingName();
	}

	@Then("^user enters area name$")
	public void user_enters_area_name() throws Throwable {
		registration.clickNext();
		registration.giveAreaName();
	}

	@Then("^user selects city$")
	public void user_selects_city() throws Throwable {
		registration.clickNext();
		registration.giveCity();
	}

	@Then("^user selects state$")
	public void user_selects_state() throws Throwable {
		registration.clickNext();
		registration.giveState();
	}

	@Then("^user selects conference access$")
	public void user_selects_conference_access() throws Throwable {
		registration.clickNext();
		registration.giveCconferenceAccess();
	}

	@Then("^click on next$")
	public void click_on_next() throws Throwable {
		registration.clickNext();
	}

	@Then("^title of page is payment details$")
	public void title_of_page_is_payment_details() throws Throwable {
		String title = Modules.driver.getTitle();
		Assert.assertEquals("Payment Details", title);
	}

	@Then("^user enters card holder name$")
	public void user_enters_card_holder_name() throws Throwable {
	   paymentDetails.clickNext();
	   paymentDetails.giveCardHolderName();
	}

	@Then("^user enters debit card number$")
	public void user_enters_debit_card_number() throws Throwable {
		paymentDetails.clickNext();
		   paymentDetails.giveDebitCardName();
	}
	
	@Then("^user enters cvv number$")
	public void user_enters_cvv_number() throws Throwable {
		paymentDetails.clickNext();
		   paymentDetails.giveCvvNumber();
	}

	@Then("^user enters card expiration month$")
	public void user_enters_card_expiration_month() throws Throwable {
		paymentDetails.clickNext();
		   paymentDetails.giveCardExpiryMonth();
	}

	@Then("^user enters card expiration year$")
	public void user_enters_card_expiration_year() throws Throwable {
		paymentDetails.clickNext();
		   paymentDetails.giveCardExpiryYear();
	}

	@Then("^click on make payment$")
	public void click_on_make_payment() throws Throwable {
		paymentDetails.clickNext();
		Modules.endTest();
	}
}
