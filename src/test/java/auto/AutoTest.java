package auto;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;

public class AutoTest extends BaseClass {

	@Test
	public void autoQuote() {
		homepage.autoSteps("personalAuto", "11373");
		aboutYou.aboutYouSteps("Mohammed", "M", "Rahman", "6: c_IV");
	}
	
	@Parameters({"autoInsurance", "zipCode", "firstName", "middleInitial", "lastName", "suffix"})
	@Test
	public void autoQuoteParameter(String autoInsurance, String zipCode, String firstName, String middleInitial, String lastName, String suffix) {
		homepage.autoSteps(autoInsurance, zipCode);
		aboutYou.aboutYouSteps(firstName, middleInitial, lastName, suffix);
	}

}