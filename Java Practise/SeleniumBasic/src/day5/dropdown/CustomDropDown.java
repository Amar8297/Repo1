package day5.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDropDown {
	public static void main(String[] args) {
		String ChromePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement dropdown=driver.findElement(By.id("bsd1-button"));
		
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		
		dropdown.click();
		
		List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		
		System.out.println("options count:"+options.size());
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
			
		}
		options.get(105).click();
		System.out.println("options.get(105).click()");
	}
}