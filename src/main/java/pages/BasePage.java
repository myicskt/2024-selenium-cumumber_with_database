package pages;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class BasePage {

	public void validatePageTitleOrElement(String actual, String excepted) {
		Assert.assertEquals(actual, excepted);

	}

	
	
	
	public String randomNumber(int n) {
		StringBuffer sbd = new StringBuffer();
		for (int i = 1; i <= n; i++) {
			int num = (int) Math.floor(Math.random() * 10);
			sbd.append(num);
		}
		return sbd.toString();
	}



}
