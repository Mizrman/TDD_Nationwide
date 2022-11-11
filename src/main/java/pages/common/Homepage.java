package pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.data.AutoData;

import static common.CommonActions.*;


public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='customSelectQuote']")
	WebElement dropdownElement;
	@FindBy(xpath = "//input[@id='detail-banner__zip-input']")
	WebElement zipcodeElement;
	@FindBy(id ="detail-banner__quote-btn")
	WebElement startYourQuoteElement;
	
	public void autoSteps(String dropdown, String zipcode) {
		selectDropdown(dropdownElement, dropdown);
		input(zipcodeElement, zipcode);
		click(startYourQuoteElement);
		
	}
	
	public void homeOwnersSteps(String dropdown, String zipcode) {
		selectDropdown(dropdownElement, dropdown);
		input(zipcodeElement, zipcode);
		click(startYourQuoteElement);
		
	}
	
	public void autoSteps(AutoData autoData) {
		selectDropdown(dropdownElement, autoData.getAutoInsurane());
		input(zipcodeElement, autoData.getZipCode());
		click(startYourQuoteElement);
		
		}
	
	
	

}
