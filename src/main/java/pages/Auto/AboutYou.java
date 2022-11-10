package pages.Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.data.AutoData;

import static common.CommonActions.*;

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
		click(agreeElement);
		
	}
	
	public void aboutYouSteps(AutoData autoData) {
		input(firstNamElement, autoData.getFirstName());
		input(middleNamElement, autoData.getMiddleInitial());
		input(lastNamElement, autoData.getLastName());
		selectDropdown(suffixElement, autoData.getSuffixString());
		click(agreeElement);
		
	}
}
