package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {

	@FindBy(id = "ap_email")
	private WebElement Username;
	@FindBy(id = "continue")
	private WebElement ContinuBtn;
	@FindBy(id = "ap_password")
	private WebElement PassWord;
	@FindBy(id = "signInSubmit")
	private WebElement SubmitBtn;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getContinuBtn() {
		return ContinuBtn;
	}

	public WebElement getPassWord() {
		return PassWord;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}

	public AmazonLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
