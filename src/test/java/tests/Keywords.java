package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keywords {
	public void click(WebDriver driver, String ObjectName, String typeLocator) {
		driver.findElement(this.getObject(ObjectName ,typeLocator)).click();
		
}

	By getObject(String ObjectName,String typeLocator) {
		return null;
	}
	
	By getObject1(String objectName, String typeLocator) throws FileNotFoundException {
		String path = null;
		// TODO Auto-generated method stub
		File file = new File(path+"\\Externals\\Object Repository.properties");
		FileInputStream fileInput = new FileInputStream(file);
	// Properties file is read
		Properties prop = new Properties();
		if (typeLocator.equalsIgnoreCase("XPATH")){
			return By.xpath(prop.getProperty(objectName));
			
			// ObjectName is read and it's valyes are returned
			
			}
		else if(typeLocator.equalsIgnoreCase("ID")){
			return By.id(prop.getProperty(objectName));
		//Object name is read and it's value are returned
		}	
	
	else if(typeLocator.equalsIgnoreCase("NAME")) {
	return By.name(prop.getProperty(objectName));
	}
	return null;
}
}