package com.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.healthdata.pages.SearchPage;

public class TwoLinksAssertion extends TestBase{

	
	@Test(groups = { "smoke" })
	public void ClickOnTwoLinks() {
		
		
		SearchPage searchPage = new SearchPage();
		
		searchPage.health.click();
		searchPage.national.click();
		
		
		String actual = searchPage.healthAndCommunity.getText();
		String expected = searchPage.testCase3.getAttribute(actual);
		
		assertEquals(actual, expected, "Results does match");
	
		assertTrue(searchPage.healthAndCommunity.isDisplayed());
	}
	

	@Test	// to verify the number of results after clicking to health
	public void TestCase3() { 
		
	
SearchPage searchPage = new SearchPage();
		
	searchPage.searchInput.sendKeys("health"+Keys.ENTER);
		
		
		String actual = searchPage.searchResults.getText();
		String expected = "4304 results";
		
		assertEquals(actual, expected, "Results does match");
	
		assertTrue(searchPage.searchResults.isDisplayed());
	}
	
	@Test	// To assert if it is sorted by Date Changed & Descending order
	public void TestCase4() { 
		
	
SearchPage searchPage = new SearchPage();
		
	searchPage.searchInput.sendKeys("drug"+Keys.ENTER);
		
			
	String expectedSort = "Date changed";
	String expectedOrder = "Descending";

	Select selectSort = new Select(searchPage.sortBy);
	Select selectOrder = new Select(searchPage.sortOrder);
	
	String actualSort = selectSort.getFirstSelectedOption().getText();
	assertEquals(expectedSort, actualSort);
	
	String actualOrder = selectOrder.getFirstSelectedOption().getText(); 
	assertEquals(expectedOrder, actualOrder);		
}
	

		
	}
	
	
	

