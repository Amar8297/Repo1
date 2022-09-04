package day3.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActitime {
		public static void main(String[] args) {
			String currentPath=System.getProperty("user.dir");
			String chromeExePath=currentPath+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com");
		
			WebElement username=driver.findElement(By.id("username"));
			
			username.sendKeys("admin");
			
			WebElement password=driver.findElement(By.name("pwd"));
		
			password.sendKeys("manager");
			
			WebElement SubmitButton=driver.findElement(By.id("loginButton"));
			SubmitButton.click();
			
		}
}
