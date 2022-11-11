package homeOwners;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;

public class HomeOwnerTest extends BaseClass {
	
	@Test
	public void homeOwnersQuote() {
		homepage.homeOwnersSteps("homeowners", "11372");
		aboutYou.aboutYouSteps("AAA", "B", "RRR", "6: c_IV");
		
	}

}
