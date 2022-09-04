package day4.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		String Path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Path);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.cssSelector("html>body>div>div>div>div>div>div>div:nth-of-type(2)>div>div>form>div:nth-of-type(5)>a")).click();
	}
}
