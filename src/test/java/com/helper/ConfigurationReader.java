package com.helper;

public class ConfigurationReader {
	public FileReader getFrInstance() throws Exception{
		FileReader fr = new FileReader();
		return fr;
	}

	public static ConfigurationReader getCrInstance()  {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}

	private ConfigurationReader() {
	}
}
