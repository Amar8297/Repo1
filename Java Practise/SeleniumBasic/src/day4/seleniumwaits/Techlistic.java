package day4.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {
	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String PageTitle=driver.getTitle();
		String ExpectedPageTitle="techlistic";
		
		System.out.println("Page title is: "+PageTitle);
		System.out.println("Expected Page Title :"+ExpectedPageTitle);
		System.out.println(PageTitle.contains(ExpectedPageTitle));
		
		driver.findElement(By.cssSelector(".overflowable-item>a")).click();
		String JavaPageTitle=driver.getTitle();
		String ExpectedJavaPageTitle="java";
		System.out.println("Page title is: "+JavaPageTitle);
		System.out.println("Expected Page Title :"+ExpectedJavaPageTitle);
		System.out.println(JavaPageTitle.contains(ExpectedJavaPageTitle));
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("ul>li:nth-of-type(2)>div>a")).click();
		String SeleniumPageTitle=driver.getTitle();
		String ExpectedSeleniumPageTitle="selenium-tutorials";
		System.out.println("Page title is: "+SeleniumPageTitle);
		System.out.println("Expected Page Title :"+ExpectedSeleniumPageTitle);
		System.out.println(SeleniumPageTitle.contains(ExpectedSeleniumPageTitle));
		driver.navigate().back();
				
		driver.findElement(By.cssSelector("ul>li:nth-of-type(7)>div>a")).click();
		String BDDPageTitle=driver.getTitle();
		String ExpectedBDDPageTitle="bdd-tutorial";
		System.out.println("Page title is: "+BDDPageTitle);
		System.out.println("Expected Page Title :"+ExpectedBDDPageTitle);
		System.out.println(BDDPageTitle.contains(ExpectedBDDPageTitle));
		driver.navigate().back();
		
		driver.close();
}
}