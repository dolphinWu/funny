package com.dolphinwu.util;

import java.io.InputStream;
import java.net.URL;

public class CommonUtils {
	
	public static URL getFileURLFromResources(String filename) {
		return CommonUtils.class.getClassLoader().getResource(filename);
	}

	public static InputStream getFileInputStreamFromResources(String filename) {
		return CommonUtils.class.getClassLoader().getResourceAsStream(filename);
	}
}
