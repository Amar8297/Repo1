package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperationsOnBrowser {
	public static void main(String[] args) {
		String driverPath3 =System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath3);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String expectedUrl ="https://www.google.com";
		String appCurrentUrl =driver.getCurrentUrl();
		System.out.println("Actual Url:"+appCurrentUrl);
		System.out.println("Ecpected Url:"+expectedUrl);
		if(appCurrentUrl.contains(expectedUrl)){
			System.out.println("Current Url validation is passed");
		}else {
			System.out.println("Current Url validation is failed ");
		}
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		System.out.println("Actual title :"+actualTitle);
		System.out.println("Expected Title :"+expectedTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title validation is passed ");
		}else {
			System.out.println("Title validation is failed ");
		}
		String sourceContent=driver.getPageSource();
		System.out.println("Source content length"+sourceContent.length());
		driver.close();
	}
}
