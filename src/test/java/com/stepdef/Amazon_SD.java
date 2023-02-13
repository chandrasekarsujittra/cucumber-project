package com.stepdef;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.baseclass;
import com.helper.AmazonPOM;
import com.helper.ConfigurationReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_SD extends baseclass {
	public static AmazonPOM ap;
	@When("enters {string} and enter {string}")
	public void user_enter_and_enter(String UserName, String PassWord) {
		ap = new AmazonPOM(driver);
		ap.getAh().getSignIn().click();
		ap.getAl().getUsername().sendKeys(UserName);
		ap.getAl().getContinuBtn().click();
		ap.getAl().getPassWord().sendKeys(PassWord);
	}
	@Then("user clicks login button")
	public void check_the_validation() {
		ap.getAl().getSubmitBtn().click();
		System.out.println("Login success");
	}
	@When("user gives input to the searchbar")
	public void user_enter_the_product_in_searchbar() {
		ap.getAh().getSearchbar().sendKeys("iphone");
		System.out.println("search data entered");
	}
	@Then("user clicks the search_icon")
	public void user_click_search_icon() {
		ap.getAh().getSearchsubmitbtn().click();

	}
	@Before("@login")
	public void bef() throws Exception {
		String BrowserName = ConfigurationReader.getCrInstance().getFrInstance().getBrowserName();
		browserLaunch(BrowserName);
		String URL = ConfigurationReader.getCrInstance().getFrInstance().getUrl();
		websiteLaunch(URL);
		System.out.println("website Launch");
	}
	@BeforeStep
	public void betstep() {
		System.out.println("befstep");
		System.out.println("Before Step:" +driver.getTitle());
	}
	@AfterStep
	public void aftstep(Scenario s) throws IOException {
		System.out.println("aftstep");
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] source = ts.getScreenshotAs(OutputType.BYTES);
		s.attach(source, "image/png", s.getName());
		System.out.println("After step:"  + driver.getTitle());
		}
	@After("@searchproduct")
	public void aft() {
		System.out.println("Browser Close");
		driver.close();
	}
}
