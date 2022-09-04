package day4.seleniumwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeCrm {
	public static void main(String[] args) {
		String ChromreExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromreExePath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String PageTitle=driver.getTitle();
		System.out.println("Page Title is :"+PageTitle);
		System.out.println("Page TitleLength :"+PageTitle.length());
		System.out.println("Page Title Status :"+PageTitle.equals("OrangeHRM"));
		
		String PageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is:"+PageUrl);
		System.out.println("Page Url status:"+PageUrl.equals("https://opensource-demo.orangehrmlive.com/"));
		
		String pageContent=driver.getPageSource();
		System.out.println("Page Source length:"+pageContent.length());
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		String HomePageUrl=driver.getCurrentUrl();
		
		System.out.println("Home Validation Url :"+HomePageUrl.contains("dashboard"));
		
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}
