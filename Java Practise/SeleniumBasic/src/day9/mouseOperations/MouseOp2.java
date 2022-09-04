package day9.mouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOp2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/");
		List<WebElement> mainMenu=driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("Main Menu option count : "+ mainMenu.size());
		Actions act=new Actions(driver);
		
		for(int i=0;i<mainMenu.size();i++) {
			WebElement option=mainMenu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1000);
			
		}
		
	}
}
