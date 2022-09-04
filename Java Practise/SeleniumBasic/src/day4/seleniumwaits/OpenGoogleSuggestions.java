package day4.seleniumwaits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleSuggestions {
		public static void main(String[] args) throws InterruptedException {
			String ChromePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.google.com");
			
			driver.findElement(By.name("q")).sendKeys("Selenium Interview Questions");
			
			Thread.sleep(2000);
			
			List<WebElement> sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
			
			System.out.println("Suggestion Count:"+sugg.size());
			
			for(int i=0;i<sugg.size();i++) {
				//WebElement element=sugg.get(i);
				//System.out.println(element);
				//or
				System.out.println(sugg.get(i).getText());
				
		
			}
		}
}
