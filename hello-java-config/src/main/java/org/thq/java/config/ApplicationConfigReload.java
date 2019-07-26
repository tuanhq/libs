package org.thq.java.config;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationConfigReload {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationConfigReload.class);
	private static PropertiesConfiguration configuration;

	static {
		try {
			
			InputStream inputSteam = loadInputStream("application.properties");
			if(inputSteam != null) {
				configuration = new PropertiesConfiguration();
				configuration.load(inputSteam);
			}else {
				File file = load(System.getProperty("catalina.base") + "/" + "application_TEST_THOI.properties",System.getProperty("user.home") + "/" + "application_TEST_THOI.properties");	
				configuration = new PropertiesConfiguration(file);
			}
			
			FileChangedReloadingStrategy fileChangedReloadingStrategy = new FileChangedReloadingStrategy();
			fileChangedReloadingStrategy.setRefreshDelay(3000);
			configuration.setReloadingStrategy(fileChangedReloadingStrategy);
		} catch (Exception e) {
			logger.error(e.toString());
		}
	}

	public static String getProperty(String key, String defaultValue) {
		String value = (String) configuration.getProperty(key);
		return value != null ? value : defaultValue;
	}

	public static String getProperty(String key) {
		return (String) configuration.getProperty(key);
	}

	public static void setProperty(String key, Object value) {
		configuration.setProperty(key, value);
	}

	public static void save() {
		try {
			configuration.save();
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}
	public static File load(String ... filePaths) {
		for (String filePath : filePaths) {
			File file = new File(filePath);
			if(file.exists()) {
				logger.error("Load config file "+filePath+" success!");
				return file;
			}
			
		}
		logger.error("CANNOT LOAD CONFIG FILE!!!!!");
		return null;
		
	}
	public static InputStream loadInputStream(String ... fileNames) {
		for (String fileName : fileNames) {
			InputStream input = ApplicationConfigReload.class.getClassLoader().getResourceAsStream(fileName);
																			   
			if(input!=null) {
				logger.error("Load inputsteam classpath config file "+fileName+" success!");
				return input;
			}
			
		}
		logger.error("CANNOT LOAD INPUTSTREAM CONFIG FILE!!!!!");
		return null;
	}
	
	public static void main(String[] args) throws InterruptedException {
		while (true) {
			System.err.println(ApplicationConfigReload.getProperty("database.host", "Hello"));
			Thread.sleep(1000);
		}
		
	}
}
