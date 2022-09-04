package day4.seleniumwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleOptions {
		public static void main(String[] args) {
			String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromeExePath);
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://google.com");
			
			driver.findElement(By.name("q")).sendKeys("Selenium Interview Questions");
			
		}
}
