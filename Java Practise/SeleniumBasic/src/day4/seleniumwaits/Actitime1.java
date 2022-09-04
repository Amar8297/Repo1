package day4.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime1 {
		public static void main(String[] args) {
			String ChromePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://demo.actitime.com/");
			
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			
			driver.findElement(By.id("addTaskButtonId")).click();
			driver.findElement(By.cssSelector(".comboboxButton >.selectedItem>.emptySelection")).click();
			driver.findElement(By.cssSelector(".itemRow:nth-of-type(3)")).click();
			driver.findElement(By.cssSelector(".selectedItem>.emptySelection")).click();
					
		}
}
