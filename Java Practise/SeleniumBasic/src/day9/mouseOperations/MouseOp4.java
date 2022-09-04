package day9.mouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOp4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//a[text ()='Create New Account']")).click();
		
		WebElement userNameInput=driver.findElement(By.name("firstname"));
				userNameInput.sendKeys("admin");
		
		act.doubleClick(userNameInput).perform();
		userNameInput.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
	}
}
