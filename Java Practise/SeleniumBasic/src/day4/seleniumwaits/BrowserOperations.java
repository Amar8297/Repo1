package day4.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {
	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(450,600));
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println("Forgot Password Page Url"+driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("Login page Url"+driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("Forget Your Password : Page Url"+driver.getCurrentUrl());
		
		driver.navigate().refresh();
		driver.navigate().to("https://www.google.com");
	}
}
