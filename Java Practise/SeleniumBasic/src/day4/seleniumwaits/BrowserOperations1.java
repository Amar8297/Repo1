package day4.seleniumwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations1 {
	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement UserNameInput=driver.findElement(By.id("username"));
		UserNameInput.clear();
		UserNameInput.sendKeys("admin");
		
		WebElement PasswordInput=driver.findElement(By.id("password"));
		PasswordInput.clear();
		PasswordInput.sendKeys("Test@123");
		
		WebElement SignInButton=driver.findElement(By.className("button"));
		SignInButton.click();
	
		WebElement AddWidget=driver.findElement(By.id("addButton"));
		AddWidget.click();
		
		
		
	}
}
