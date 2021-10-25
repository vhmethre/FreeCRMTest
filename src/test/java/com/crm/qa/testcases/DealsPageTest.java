package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class DealsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	DealsPage dealsPage;

	public DealsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		dealsPage = homePage.clickOnDealsLink();
	}

	@Test(priority = 1)
	public void verifyDealsPageLable() {

		Assert.assertTrue(dealsPage.verifyDealssLabel(), "Deals label is missing on the page");
	}

	/*@Test(priority= 2)
	public void validateNewDeals() {
		homePage.clickOnNewDealsLink();
		dealsPage.createNewDeals("Mr.", "Amazon", "Amogh"); 

	} */

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
