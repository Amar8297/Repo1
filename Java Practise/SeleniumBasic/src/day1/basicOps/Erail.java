package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().length());
		
		driver.close();
	}
}
