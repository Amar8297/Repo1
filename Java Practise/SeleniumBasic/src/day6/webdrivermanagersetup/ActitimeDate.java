package day6.webdrivermanagersetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeDate {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
			
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.cssSelector(".addNewButton")).click();
		
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		
		/*WebDriverWait wait=new WebDriverWait(driver,20);
		
		WebElement dropdown=driver.findElement(By.id(".dropdownButton"));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		
		dropdown.click();*/
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		driver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(4)")).click();
		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("TESTING1235");
		driver.findElement(By.cssSelector(".x-btn-center")).click();
		driver.findElement(By.cssSelector("ul>li>div>table>tbody>tr>td:nth-of-type(3)")).click();
		driver.findElement(By.cssSelector(".x-date-inner>tbody>*:nth-child(2)>*:nth-child(7)>a>em>span")).click();
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder>div>div")).click();
		driver.findElement(By.cssSelector(".noLastTrackingDate>td>div>div")).click();
		driver.findElement(By.cssSelector(".delete.button")).click();
		driver.findElement(By.cssSelector(".delete.button")).click();
		
	}
}
