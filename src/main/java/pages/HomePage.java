package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='search-field']")
	WebElement searchButton;

	public void clickSearchButton() throws InterruptedException {

		searchButton.click();
		Thread.sleep(5000);

	}

	@FindBy(xpath = "(//img[@class='bc-logo logo-us'])[1]")
	WebElement logo;

	public void logo() throws InterruptedException {
		logo.click();
		Thread.sleep(4000);

	}

}
