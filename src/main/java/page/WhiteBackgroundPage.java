package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhiteBackgroundPage {


		WebDriver driver;

		public WhiteBackgroundPage(WebDriver driver) {
			this.driver = driver;
		}
		
		@FindBy(how = How.XPATH, using = "//button[text()='Set White Background']")
		WebElement SET_WHITE_BACKGROUND;
		@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
		WebElement VERIFIED_WHITE_BACKGROUND;
		
		public void clickOnSetWhiteBackgroundbutton() {
			SET_WHITE_BACKGROUND.click();
		}
			public void verifiedWhitegroundColorChangeToWhite() throws InterruptedException {
				String expected = "NSS-TODO List v 1.1";
				String actual = VERIFIED_WHITE_BACKGROUND.getText();
				Thread.sleep(3000);
				System.out.println(actual);
				Assert.assertEquals(expected, actual);
			}
	
}
