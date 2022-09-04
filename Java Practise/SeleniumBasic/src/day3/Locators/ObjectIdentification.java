package day3.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {
		public static void main(String[] args) {
			String currentWorkingDir=System.getProperty("user.dir");
			String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",chromeExePath);
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.vtiger.com/vtigercrm/index.php");
			
			WebElement username=driver.findElement(By.id("username"));
			username.clear();
			username.sendKeys("admin");
			WebElement pwd=driver.findElement(By.id("password"));
			pwd.clear();
			pwd.sendKeys("Test@123");
			
			WebElement submitBtn=driver.findElement(By.className("buttonBlue"));
			submitBtn.click();
		}
}
