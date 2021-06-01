package com.toolsqa.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageLocators {
	
	@FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(1) > div")
	public WebElement elements;
	
	@FindBys({
		@FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(2) > div")
	})
	public WebElement frms;
	
	@FindBys({
		@FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(3) > div")
	})
	public WebElement alertsfrmwin;
	
	@FindBys({
		@FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(4)")
	})
	public WebElement widgets;	
	
	@FindBys({
		@FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(5)")
	})
	public WebElement interactions;	
	
	@FindBys({
		@FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(6)")
	})
	public WebElement bookstoreapp;
	


}
