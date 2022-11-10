package auto;

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

}