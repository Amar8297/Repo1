package day4.seleniumwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumValidation {
	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("User name is displayed or not? "+userNameInputField.isDisplayed());
		System.out.println("User name is functional or not? "+userNameInputField.isEnabled());
		
		String defaultValueInUserNameInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("Default value of user name input field: "+defaultValueInUserNameInputField);
		System.out.println("Default value validation for user name input field status: "+defaultValueInUserNameInputField.equals("Username"));
	
		WebElement keepLoggedInLabelCheckBoxText=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(keepLoggedInLabelCheckBoxText.isDisplayed());
		System.out.println(keepLoggedInLabelCheckBoxText.isEnabled());
		String checkBoxTextName=keepLoggedInLabelCheckBoxText.getText();
		System.out.println(checkBoxTextName);
	}

}