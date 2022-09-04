package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGooglePage {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\Java Practise\\SeleniumBasic\\Executables\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			System.out.println("Current Url: "+driver.getCurrentUrl());
			System.out.println(driver.getPageSource().length());
			
			driver.close();
		}
}
