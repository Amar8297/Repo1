package day6.webdrivermanagersetup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		driver.findElement(By.cssSelector("li[select-id='results[0]']")).click();
		
		driver.findElement(By.id("dest")).sendKeys("Goa");
		driver.findElement(By.cssSelector("li[select-id='results[0]']")).click();
		
		driver.findElement(By.cssSelector("label[class='db text-trans-uc']")).click();
		driver.findElement(By.cssSelector("td[class='next']")).click();
		driver.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>tr:nth-of-type(4)>:nth-child(4)")).click();
		
		driver.findElement(By.id("search_btn")).click();
		
		driver.findElement(By.cssSelector("label[for='dtAfter 6 pm']")).click();
		driver.findElement(By.cssSelector("label[for='bt_AC']")).click();
		
		List<WebElement> BusDetails=driver.findElements(By.cssSelector("div[class='clearfix bus-item-details']"));
		System.out.println("Suggestion count:"+BusDetails.size());
		for(int i=0;i<BusDetails.size();i++) {
			WebElement element=BusDetails.get(i);
			System.out.println("\n"+element.getText()+"\\n");
							//or
			//System.out.println(sugg.get(i).getText());
		}driver.close();
	}
}
