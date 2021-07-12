package steps_Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SkyBlueBackgroundPage;

import util.BrowserFactoryFinal;

public class StepDef_Skyblue_Background {
	WebDriver driver;
	SkyBlueBackgroundPage skyBlueBackgroundPage;
	
	@Given ("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {
		driver= BrowserFactoryFinal.startBrowser();
		skyBlueBackgroundPage= PageFactory.initElements(driver, SkyBlueBackgroundPage.class);
	}
	
	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
		skyBlueBackgroundPage.clickOnSetSkyblueBackgroungButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		skyBlueBackgroundPage.verifiedBackgroundColorChangeToSkyblue();
	}
}
