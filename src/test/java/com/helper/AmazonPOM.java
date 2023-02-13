package com.helper;

import org.openqa.selenium.WebDriver;
import com.pom.AmazonHome;
import com.pom.AmazonLogin;

public class AmazonPOM {
	private WebDriver driver;
	private AmazonHome ah;
	private AmazonLogin al;

	public AmazonHome getAh() {
		ah = new AmazonHome(driver);
		return ah;
	}

	public AmazonLogin getAl() {
		al = new AmazonLogin(driver);
		return al;
	}

	public AmazonPOM(WebDriver driver) {
		this.driver = driver;
	}
}
