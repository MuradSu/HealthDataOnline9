package com.healthdata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.healthdata.utilities.Driver;

public class FeedBackPage {
	private WebDriver driver;
	
	public FeedBackPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="edit-title")
	public WebElement title;
	
	@FindBy(id="edit-field-contact-email-und-0-value")
	public WebElement email;
	
	@FindBy(id="edit-body-und-0-value")
	public WebElement feedback;
	
	@FindBy(id="autocomplete-deluxe-input")
	public WebElement tags;
	
	@FindBy(id="edit-field-feedback-entity-reference-und")
	public WebElement dataset;
	
	@FindBy(id="edit-field-feedback-type-und")
	public WebElement feedbackType;
	
	@FindBy(id="edit-submit")
	public WebElement saveButton;
	
	
	
	
	
}
