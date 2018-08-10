package com.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.healthdata.pages.SearchPage;

public class InvalidSearch extends TestBase{
	
	@Test (groups = { "smoke" })
	public void InvalidSearchTermInSearchBox() {
		
		SearchPage searchPage = new SearchPage();
		
		searchPage.searchInput.sendKeys("c");
		searchPage.applyButton.click();
		
		String actual = searchPage.errorMessage.getText();
		String expected = "No results were found. Please try another keyword.";
		
		assertEquals(actual, expected, "Results does not match");
		
		//assertFalse(searchPage.searchResults.isDisplayed());
	}

	@Test
	public void TestCase1() {
		
		SearchPage searchPage = new SearchPage();
		
		searchPage.searchInput.sendKeys("dshhgfdh");
		searchPage.applyButton.click();
		
		String actual = searchPage.errorMessage.getText();
		String expected = "No results were found. Please try another keyword.";
		
		assertEquals(actual, expected, "Results does not match");
		
		//assertFalse(searchPage.searchResults.isDisplayed());
	
	}
}
