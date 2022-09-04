package day4.seleniumwaits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {
	public static void main(String[] args) {
	String Path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",Path);
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.gsmarena.com/");
	
	
	List<WebElement> Bar=driver.findElements(By.cssSelector("div.module-phones"));
	System.out.println("Main menu Option Count :"+Bar.size());
	for(int i=0;i<Bar.size();i++) {
		System.out.println(Bar.get(i).getText()+": "+Bar.get(i).getText());
	}
}
}

