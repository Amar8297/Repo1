package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDemoActitime {
		public static void main(String[] args) {
			String driverPath1=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath1);
			WebDriver wdriver=new ChromeDriver();
			wdriver.get("https://demo.actitime.com");
			System.out.println(wdriver.getTitle());
			System.out.println(wdriver.getTitle().length());
			String actualUrl=wdriver.getCurrentUrl();
			String exceptedUrl="https://demo.actitime.com/";
			System.out.println(actualUrl.equals(exceptedUrl));
			System.out.println(actualUrl.contains(exceptedUrl));
			System.out.println(wdriver.getCurrentUrl());
			System.out.println(wdriver.getPageSource().length());
			wdriver.close();
		}
}
