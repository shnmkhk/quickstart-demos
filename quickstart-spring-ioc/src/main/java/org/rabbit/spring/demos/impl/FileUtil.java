package org.rabbit.spring.demos.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

	public static String getFileContent(String fileName) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String s = null;
		while ((s = br.readLine()) != null) {
			sb.append(s).append("\n");
		}
		return sb.toString();
	}
}
