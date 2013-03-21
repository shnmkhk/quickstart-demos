package org.rabbit.spring.demos;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/context.xml"));
		IFileService fileService = (IFileService) factory.getBean("fileService");
		String returedFileContent = fileService.getFileContent("src/main/resources/content.txt");
		System.out.println("File Content: \n");
		System.out.println(returedFileContent);
	}
}