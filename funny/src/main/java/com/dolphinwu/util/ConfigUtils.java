package com.dolphinwu.util;

import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	
	private static final Properties PROPERTIES = new Properties();
	
	static {
		try {
			PROPERTIES.load(CommonUtils.getFileInputStreamFromResources("config.properties"));
		} catch (IOException e) {
			System.out.println("加载配置文件出错");
			e.printStackTrace();
		}
	}
	
	public static void initConfig(String configFile) {
		PROPERTIES.clear();
		try {
			PROPERTIES.load(CommonUtils.getFileInputStreamFromResources(configFile));
		} catch (IOException e) {
			System.out.println("initConfig加载配置文件出错");
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String name) {
		return PROPERTIES.getProperty(name);
	}
	
	public static int getIntProperty(String name) {
		return new Integer(PROPERTIES.getProperty(name));
	}
	
	public static long getLongProperty(String name) {
		return new Long(PROPERTIES.getProperty(name));
	}
	
	public static double getDoubleProperty(String name) {
		return new Double(PROPERTIES.getProperty(name));
	}
	
	public static float getFloatProperty(String name) {
		return new Float(PROPERTIES.getProperty(name));
	}
}
