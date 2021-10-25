package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'User: Gayatri das')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;

//	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	@FindBy(xpath = "//input[@value='New Contact']")
	WebElement newContactLink;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath="//div[@id='navmenu']//ul//li[5]//ul//li[1]/a")
	WebElement newDealsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement taskLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public ContactsPage clickOnContactsLink() {

		contactsLink.click();
		return new ContactsPage();
	}

	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}

	public TasksPage clickOnTasksLink() {
		taskLink.click();
		return new TasksPage();

	}

	public boolean verifyCorrectUserName() {

		return userNameLabel.isDisplayed();

	}

	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}
	
	public void clickOnNewDealsLink() {
		Actions action = new Actions(driver);
		action.moveToElement(dealsLink).build().perform();
		newDealsLink.click();
	}

}
