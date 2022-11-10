package auto;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import utils.data.AutoData;

public class TestwithAutoData extends BaseClass {
	AutoData autoData = new AutoData("personalAuto", "11373", "Mohammed", "M", "Rahman", "6: c_IV");
	
	
	@Test
	public void autoCodewithAutoData() {
		homepage.autoSteps(autoData);
		aboutYou.aboutYouSteps(autoData);
	}

}

