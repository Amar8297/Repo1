package day4.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
		public static void main(String[] args) {
			String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromeExePath);
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
			driver.get("https://demosite.executeautomation.com/Login.html");
			
			driver.findElement(By.name("UserName")).sendKeys("execution");
			
			driver.findElement(By.name("Password")).sendKeys("admin");
			
			driver.findElement(By.name("Login")).click();
	
			System.out.println("Hi");
			
			driver.findElement(By.linkText("Logout"));
			
			driver.close();
		}
}
