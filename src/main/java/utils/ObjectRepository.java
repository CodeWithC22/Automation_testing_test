package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectRepository 
{
	public static void main(String args[]) throws IOException{
	
	File testDataFile = new File("/Users/charukushwah/Desktop/Learnings/SeleniumFramework/Repository/testdata.properties");
	
	FileInputStream fisTestData = new FileInputStream(testDataFile);
	
	Properties propTestData = new Properties();
	
	propTestData.load(fisTestData);
	
	}
	

}
