package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import reporting.Logs;

public class CommonActions {

	public static void click(WebElement element) {
		try {
			element.click();
			Logs.log(element + " <--- has been clicked");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("ELEMENT NOT FOUND ---> " + element);
			Assert.fail();
		}
	}

	public static void selectDropdown(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.selectByValue(value);
			Logs.log(value + " : has been selected for ---> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("ELEMENT NOT FOUND ---> " + element);

		}

	}

	public static void input(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + " : has been passed to ---> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("ELEMENT NOT FOUND ---> " + element);
			Assert.fail();
		}
	}

	public static boolean isPresent(WebElement element) {
		try {
			element.isEnabled();
			Logs.log(element + " <------ : has been present ");
			return true;

		} catch (NoSuchElementException | NullPointerException e) {
			Logs.log("ELEMENT NOT FOUND ---> " + element);
			return false;

		}

	}

	public static boolean isDisplayed(WebElement element) {
		if (element.isDisplayed()) {
			Logs.log(element + " <----- is visible ");
			return true;
		} else {
			Logs.log(element + " <---- Not visible");
		}
		return false;
	}

}
