package day6.webdrivermanagersetup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://etrain.info/in");
		
		WebElement Station1=driver.findElement(By.id("tbsfi1"));
	
		Station1.sendKeys("Pune");
		
		driver.findElement(By.cssSelector(".ui-menu-item>a")).click();

		WebElement Station2=driver.findElement(By.id("tbsfi3"));
		Station2.click();
		
		Station2.sendKeys("mumbai");
		
		driver.findElement(By.cssSelector("div.ui-menu-item:nth-of-type(3)>a")).click();
	
		driver.findElement(By.id("tbsfi4")).click();
		driver.findElement(By.cssSelector("body>div:nth-of-type(2)>table>tbody>tr>td:nth-of-type(3)>input")).click();
		driver.findElement(By.cssSelector("body>div:nth-of-type(2)>table>tbody>tr:nth-of-type(4)>td:nth-of-type(5)>input")).click();
		
		driver.findElement(By.id("tbsfi5")).click();
		driver.findElement(By.cssSelector("option[value='TQ']")).click();
		driver.findElement(By.id("tbssbmtbtn")).click();
		
		List<WebElement> sugg=driver.findElements(By.cssSelector("table>tbody"));
		System.out.println("Suggestion count:" +sugg.size());
		//print suggestions in the console
		for(int i=0;i<sugg.size();i++) {
			WebElement element=sugg.get(i);
			System.out.println(element.getText());
							//or
			//System.out.println(sugg.get(i).getText());*/
		}
}
		}
	
