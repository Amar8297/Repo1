package revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;

public class Practise1 extends SeleniumUtility{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Practise1 p1=new Practise1();
		WebDriver driver=p1.setUp("chrome","https://www.flipkart.com/" );
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		p1.doubleClick(driver.findElement(By.xpath("//img[contains(@alt,'Mobiles')]")));
		p1.performClick(driver.findElement(By.xpath("//div[text()='SAMSUNG']")));
		//WebElement element = driver.findElement(By.xpath("//body"));
		Thread.sleep(1000);
		
		//p1.mouseHover(driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']")));
		p1.performClick(driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']")));
		
		WebElement price=driver.findElement(By.xpath("//div[div[h1[span[text()='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']]]]/div[4]/div/div/div"));
		System.out.println(price.getText());
		}

}