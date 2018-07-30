package com.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.healthdata.pages.SearchPage;

public class TwoLinksAssertion extends TestBase{

	
	@Test(groups = { "smoke" })
	public void ClickOnTwoLinks() {
		
		
		SearchPage searchPage = new SearchPage();
		
		searchPage.health.click();
		searchPage.national.click();
		
		
		String actual = searchPage.healthAndCommunity.getText();
		String expected = "55 results";
		
		assertEquals(actual, expected, "Results does match");
	
		assertTrue(searchPage.healthAndCommunity.isDisplayed());
	}
	
	
}
