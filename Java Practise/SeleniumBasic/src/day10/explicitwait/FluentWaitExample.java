package day10.explicitwait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitExample {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink"))).click();
		
		System.out.println("Home Page Title : "+driver.getTitle());
	}
}
