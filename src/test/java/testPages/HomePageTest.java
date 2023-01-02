package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled =true)
	public void clickSearchButton() throws InterruptedException {
		homePage.clickSearchButton();
	}

	@Test(enabled = false)
	public void logo() throws InterruptedException {
		homePage.logo();
	}

}
