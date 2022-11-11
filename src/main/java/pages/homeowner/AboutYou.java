package pages.homeowner;

import static common.CommonActions.input;
import static common.CommonActions.selectDropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutYou {
	
	public AboutYou(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "gs-first-name")
	WebElement firstNamElement;
	@FindBy(id = "gs-middle-name")
	WebElement middleNamElement;
	@FindBy(id = "gs-last-name")
	WebElement lastNamElement;
	@FindBy(id = "gs-suffix")
	WebElement suffixElement;
	@FindBy(id = "nav-continue")
	WebElement agreeElement;
	
	
	public void aboutYouSteps(String firstName, String middleInitial, String lastName, String suffix) {
		input(firstNamElement, firstName);
		input(middleNamElement, middleInitial);
		input(lastNamElement, lastName);
		selectDropdown(suffixElement, suffix);
		//click(agreeElement);
		
	}

}
