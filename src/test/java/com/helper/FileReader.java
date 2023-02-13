package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileReader {
	private Properties p = new Properties();

	public FileReader() throws Exception  {
		File f = new File(
				"C:\\Users\\Chandrasekar\\eclipse-workspace\\ecom\\src\\test\\java\\com\\property\\data.property");
		FileInputStream fis = new FileInputStream(f);
		p.load(fis);
	}

	public String getBrowserName() {
		String BrowserName = p.getProperty("browser");
		return BrowserName;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
}
