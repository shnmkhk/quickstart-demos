package org.rabbit.spring.demos.impl;

import java.io.IOException;

import org.rabbit.spring.demos.IFileService;

public class FileService implements IFileService {

	private FileUtil fileUtil;
	
	private CurrencyFormatter myCurrencyFormatter;
	
	public void setMyCurrencyFormatter(CurrencyFormatter myCurrencyFormatter) {
		this.myCurrencyFormatter = myCurrencyFormatter;
	}

	public FileService(FileUtil fileUtil, int a, int b, String s) {
		this.fileUtil = fileUtil;
	}

	public String getFileContent(String fileName) {
		try {
			double input = 748945.74;
			System.out.println("Input: "+input+"; Output (formatted in currency): " + myCurrencyFormatter.getFormattedPrice(input));
			return fileUtil.getFileContent(fileName);
		} catch (IOException ioe) { 
			ioe.printStackTrace();
			return null;
		} 
	}
}
