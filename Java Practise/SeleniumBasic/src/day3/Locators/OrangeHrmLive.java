package day3.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLive {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String currentDir=System.getProperty("user.dir");
		String chromeXPath= currentDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeXPath);
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement pwd=driver.findElement(By.id("txtPassword"));
		pwd.clear();
		pwd.sendKeys("admin123");
		
		WebElement submitButton=driver.findElement(By.name("Submit"));
		submitButton.click();
		}
}
