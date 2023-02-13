package com.baseclass;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class baseclass {
	public static WebDriver driver;

	public static void browserLaunch(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandrasekar\\eclipse-workspace\\ecom\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Chandrasekar\\eclipse-workspace\\ecom\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browserName.equalsIgnoreCase("edge")){
				System.setProperty("webdriver.edge.driver", "C:\\Users\\Chandrasekar\\eclipse-workspace\\ecom\\Driver\\msedgedriver.exe");
				driver = new EdgeDriver();		
			}else {
				System.out.println("Use Chrome or Firefox otherwise update browserdriver in baseclass");
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static void idWithSendKeys(String idValue,String TextValue) {
		driver.findElement(By.id(idValue)).sendKeys(TextValue);
	}
	public static void nameWithSendKeys(String idValue,String TextValue) {
		driver.findElement(By.id(idValue)).sendKeys(TextValue);
	}
	public static void id_click(String idvalue) {
		try {
			driver.findElement(By.id(idvalue)).click();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	public static void websiteLaunch(String Url) {
		driver.get(Url);
	}
	public static void browserClose() throws InterruptedException {
		Thread.sleep(10000L);
		driver.close();
	}

	public static void sendKeysElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clearOnElement(WebElement element) {
		element.clear();
	}

	public static void webPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void webPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void simpleAlertDemo(WebElement element) throws InterruptedException {
		element.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

	public static void confirmAlert(WebElement element, String okOrCancel) throws InterruptedException {
		element.click();
		Thread.sleep(3000);
		if (okOrCancel.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (okOrCancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		} else {
			System.out.println("choose ok or cancel");
		}

	}

	public static void promptAlert(WebElement element,String Text,String okOrCancel) throws InterruptedException {
		element.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(Text);
		Thread.sleep(2000);
		if (okOrCancel.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (okOrCancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		} else {
			System.out.println("choose ok or cancel");
		}
	}
	
	public static void shotscreen(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Target = new File(path);
		Files.copy(source, Target);

	}
	public static void backward() {
		driver.navigate().back();
	}
		public static void forward() {
			driver.navigate().forward();
		}
			public static void refresh() {
				driver.navigate().refresh();
			}
				public static void navigateToURL(String URL) {
					driver.navigate().to(URL);
				}
				public static void quit() {
					driver.quit();//closes entire browser
				}
				public static void websitelaunch(String url) {
					driver.get(url);
				}
				public static void clickOnElement(WebElement element) {
					element.click();
				}
				public static void sendkeysToElement(WebElement element,String Text) {
					element.sendKeys(Text);
				}
				public static void simpleAlert() {
					driver.switchTo().alert().accept();
				}
				public static void confirmAlert(String acceptOrDismiss) {
					if (acceptOrDismiss.equalsIgnoreCase("accept")) {
						driver.switchTo().alert().accept();
					}else {
						driver.switchTo().alert().dismiss();
					}
					}
				public static void promptAlert(String Text, String okOrCancel) {
					Alert alert = driver.switchTo().alert();
					alert.sendKeys(Text);
					if (okOrCancel.equalsIgnoreCase("OK")) {
						alert.accept();
					}else {
						alert.dismiss();
					}

				}}
