package day4.seleniumwaits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealMePhone {
	public static void main(String[] args) {
		String Path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Path);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		
		driver.findElement(By.cssSelector("html>body>div>div>div>aside>div>ul>li:nth-of-type(14)>a")).click();
		
		List<WebElement> Bar=driver.findElements(By.cssSelector("html>body>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>ul"));
		System.out.println("Main menu Option Count :"+Bar.size());
		for(int i=0;i<Bar.size();i++) {
			System.out.println(Bar.get(i).getText()+": "+Bar.get(i).getText());
		}
		
		WebElement Pagination=driver.findElement(By.cssSelector("html>body>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div:nth-of-type(3)>div>strong"));
		System.out.println("Page has Pagination or not ?"+Pagination);
}

}
