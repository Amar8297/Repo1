package day4.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLogin {
	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//driver.findElement(By.id("username")).sendKeys("admin");
		
		//driver.findElement(By.id("password")).sendKeys("Test@123");
		
		driver.findElement(By.className("buttonBlue")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.cssSelector("a[data-name='History']")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.cssSelector("a[data-name='CalendarActivities']")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.cssSelector("a[data-name='GroupedBySalesPerson']")).click();
	
		driver.findElement(By.cssSelector("i[title='Remove']")).click();
	
		driver.findElement(By.cssSelector("[class='btn confirm-box-ok confirm-box-btn-pad btn-primary']")
	}
}
