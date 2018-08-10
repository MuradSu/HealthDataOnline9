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
	
	@FindBy(id="edit-query")
	public WebElement searchInput;
	
	@FindBy(id="edit-submit-dkan-datasets")
	public WebElement applyButton;
	
	@FindBy(id="edit-reset")
	public WebElement resetButton;
	
	@FindBy(className="view-header")
	public WebElement searchResults;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/section/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/p")
	public WebElement errorMessage;
	
	
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
	
	@FindBy(id="facetapi-link")
	public WebElement health;
	
	@FindBy(id="facetapi-link--2")
	public WebElement state;
	
	@FindBy(id="facetapi-link--3")
	public WebElement national;
	
	@FindBy(id="facetapi-link--4")
	public WebElement medicare;
	
	@FindBy(id="facetapi-link--5")
	public WebElement hospital;
	
	@FindBy(id="facetapi-link--6")
	public WebElement quality;
	
	@FindBy(id="facetapi-link--7")
	public WebElement community;
	
	@FindBy(id="facetapi-link--8")
	public WebElement inpatient;
	
	@FindBy(id="edit-sort-order")
	public WebElement sortOrder;
	
	@FindBy(id="edit-sort-by")
	public WebElement sortBy;
	

    @FindBy(xpath="//div[@class='view-header']")
    public WebElement healthAndCommunity;

	@FindBy(id="anch_108")
	public WebElement feedbackButton;
	

	
	
}
