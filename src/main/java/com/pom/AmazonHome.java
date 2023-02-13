package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {
	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement SignIn;
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchbar;
	@FindBy(id = "nav-search-submit-button")
	private WebElement searchsubmitbtn;
	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchsubmitbtn() {
		return searchsubmitbtn;
	}

	public AmazonHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
