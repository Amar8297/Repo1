package day4.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
		public static void main(String[] args) {
			String ChromePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://amazon.in");
			
			String Title=driver.getTitle();
			System.out.println("Title "+Title);
			
			driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Amazon Pay");
			
			driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
			
			System.out.println("Current Page Title: "+driver.getTitle());
			
			driver.navigate().back();
			
			String CurrentTitle=driver.getTitle();
			System.out.println("Current Page Title: "+CurrentTitle);
			System.out.println("Comapring Url With Point no4 :"+Title.equals(CurrentTitle));
			System.out.println("Comapring Url With Point no4 :"+Title.contains(CurrentTitle));
			}
}
