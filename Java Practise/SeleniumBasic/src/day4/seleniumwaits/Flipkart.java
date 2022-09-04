package day4.seleniumwaits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		String ChromePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
	
		
		List<WebElement> Bar=driver.findElements(By.cssSelector("div.eFQ30H"));
		
		System.out.println("Main Menu Option Count :"+Bar.size());
		for(int i=0;i<Bar.size();i++) {
			System.out.println(Bar.get(i).getText()+": "+Bar.get(i).getText());
		}
	}
}
