package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class NewTest {
  
@Test
public void executeSessionThree () {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
			
  ChromeDriver driver = new ChromeDriver(options);
  //WebDriver driver = new InternetExplorerDriver();
  //System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer_Win32_4.14.0\\IEDriverServer.exe");
  
  driver.get("http://guru99.com/V4/");
  driver.findElement(By.name("s")).sendKeys("Driver 3");

}
}
