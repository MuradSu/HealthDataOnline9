package com.healthdata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.healthdata.utilities.Driver;

public class SearchPage {
	private WebDriver driver;
	
	public SearchPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='panel-panel-inner'])[1]/div[1]")
	public WebElement contentTypes;
	
	@FindBy(xpath="(//div[@class='panel-panel-inner'])[1]/div[2]")
	public WebElement topics;
	
	@FindBy(xpath="(//div[@class='panel-panel-inner'])[1]/div[3]")
	public WebElement tags;
	
	@FindBy(xpath="(//div[@class='panel-panel-inner'])[1]/div[4]")
	public WebElement format;
	
	@FindBy(xpath="(//div[@class='panel-panel-inner'])[1]/div[5]")
	public WebElement publisher;

	@FindBy(xpath="(//div[@class='panel-panel-inner'])[1]/div[6]")
	public WebElement license;
	
	@FindBy(id="facetapi-link--197")
	public WebElement resource;
	
	@FindBy(id="facetapi-link--198")
	public WebElement dataset;
	
	@FindBy(id="facetapi-link--199")
	public WebElement blog;
	
	@FindBy(id="facetapi-link--200")
	public WebElement group;
	
	@FindBy(id="facetapi-link--201")
	public WebElement page;
	
	
	
	
}
