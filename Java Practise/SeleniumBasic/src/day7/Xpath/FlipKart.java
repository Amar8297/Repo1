package day7.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.className("_2doB4z")).click();
			
			driver.findElement(By.xpath("//img[@class='_396cs4  _3exPp9' and @alt='Mobiles']")).click();
			driver.findElement(By.xpath("//img[@class='kJjFO0 _3DIhEh' and @alt='Samsung F23 - English']")).click();
			}
}
