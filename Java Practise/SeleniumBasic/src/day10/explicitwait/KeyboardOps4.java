package day10.explicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOps4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		WebElement element =driver.findElement(By.xpath("//body"));
		
		element.sendKeys(Keys.ESCAPE);
		
		for(int i=0;i<10;i++) {
				element.sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(1500);
		}
		
		Thread.sleep(2000);
		
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(1500);
		
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
	}

}
