package com.healthdata.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.healthdata.pages.SearchPage;

public class verfiySort extends TestBase{
	
	@Test(groups = "smoke")
	public void sortTest() {
		
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
