package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'Deals')]")
	WebElement dealsLabel;
	
	@FindBy (xpath="//a[@title='Deals']")
	WebElement dealsLink;
	
	
	
	@FindBy(id="title")
	WebElement title;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(name="identifier")
	WebElement identifier;
	
	@FindBy(xpath="//*[@id='prospectForm']/table/tbody/tr[1]/td/input[1]")
	WebElement saveBtn;
	
	public DealsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyDealssLabel() {
		return dealsLabel.isDisplayed();
	}
	

	public DealsPage clickOnDealsLink() {
		
		dealsLink.click();
		return new DealsPage();
	}
	
	
	
	public void createNewDeals(String Title , String Company , String Ident) {
		title.sendKeys(Title);
		company.sendKeys(Company);
		identifier.sendKeys(Ident);
		saveBtn.click();
		
		
		
	}

}

