package day6.webdrivermanagersetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssValueValidation {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement signInButton=driver.findElement(By.cssSelector("button[type='submit']"));
		System.out.println("Font color :"+signInButton.getCssValue("color"));
		System.out.println("Font Size:"+signInButton.getCssValue("font-size"));
		System.out.println("BackGround Color :"+signInButton.getCssValue("background-image"));
		
		WebElement ForgetPasswordLink=driver.findElement(By.cssSelector(".forgotPasswordLink"));
		
		System.out.println("Forget Password Text color :"+ForgetPasswordLink.getCssValue("color"));
	}
}
