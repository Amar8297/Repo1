package day4.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
		public static void main(String[] args) throws InterruptedException {
			String ChromePathExe=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePathExe);
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String pageTitle=driver.getTitle();
			
			System.out.println("Page title is :"+pageTitle);
			System.out.println("Page length is :"+pageTitle.length());
			String expectedTitle="actiTIME - Login";
			
			System.out.println("Title validation is :"+pageTitle.equals(expectedTitle));
			String pageUrl=driver.getCurrentUrl();
			System.out.println("Page Url is :"+pageUrl);
			String expectedUrl="https://demo.actitime.com/";
			
			System.out.println("Url Validation is :"+pageUrl.contains(expectedUrl));
			
			driver.findElement(By.id("username")).sendKeys("admin");
			
			driver.findElement(By.name("pwd")).sendKeys("manager");
			
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(2000);
			
			String HomePageTitle =driver.getTitle();
			System.out.println("HomePageTitle :"+HomePageTitle);
			System.out.println("Home PageTitle Validation :"+pageTitle.equals(expectedTitle));
			
			driver.close();
			
		}
}
