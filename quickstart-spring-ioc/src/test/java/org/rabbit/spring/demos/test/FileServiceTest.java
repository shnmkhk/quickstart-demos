package org.rabbit.spring.demos.test;

import org.rabbit.spring.demos.IFileService;
import org.rabbit.spring.demos.impl.FileUtil;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FileServiceTest extends TestCase {

	public static String EXPECTED_FILE_CONTENT = "";
	
	protected void setUp() throws Exception {
		EXPECTED_FILE_CONTENT = FileUtil.getFileContent("src/main/resources/content.txt");
	}
	
	public void testGetFileContent(){
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
                "src/main/resources/context.xml"));
		IFileService fileService = (IFileService) factory.getBean("fileService");
		String actual = fileService.getFileContent("src/main/resources/content.txt");
		Assert.assertEquals(EXPECTED_FILE_CONTENT, actual);
	}
}
