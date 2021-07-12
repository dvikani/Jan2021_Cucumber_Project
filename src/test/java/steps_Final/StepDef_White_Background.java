package steps_Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WhiteBackgroundPage;
import util.BrowserFactoryFinal;

public class StepDef_White_Background {

	WebDriver driver;
	
	WhiteBackgroundPage whiteBackgroundPage;
	
	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {
		driver= BrowserFactoryFinal.startBrowser();
		whiteBackgroundPage= PageFactory.initElements(driver, WhiteBackgroundPage.class);
	}

	@When("^I clicked on the button$")
	public void i_clicked_on_the_button() throws Throwable {
		whiteBackgroundPage.clickOnSetWhiteBackgroundbutton();
	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		whiteBackgroundPage.verifiedWhitegroundColorChangeToWhite();
		
	}

}
