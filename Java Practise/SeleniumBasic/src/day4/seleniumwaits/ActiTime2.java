package day4.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime2 {
	public static void main(String[] args) throws InterruptedException {
		String ChromePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		
		WebElement username=driver.findElement(By.id("username"));
		
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.name("pwd"));
	
		password.sendKeys("manager");
		
		WebElement SubmitButton=driver.findElement(By.id("loginButton"));
		SubmitButton.click();
	
		driver.findElement(By.id("container_tasks")).click();
		
driver.findElement(By.cssSelector(".addNewButton")).click();
		
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(4)")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("TESTING88");
		
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder>.components_button")).click();
		
		driver.findElement(By.cssSelector("div[class='checkbox inactive']")).click();
		
		driver.findElement(By.cssSelector("div[class='delete button']")).click();
		
		driver.findElement(By.cssSelector(".buttonIcon")).click();
		
		driver.navigate().back();
		
		driver.navigate().back();
	}
}
