package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver wdriver=new ChromeDriver();
		wdriver.get("https://www.facebook.com/");
		String actualUrl=wdriver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com/";
		System.out.println(actualUrl.equals(expectedUrl));
		System.out.println(wdriver.getTitle());
		String actualTitle=wdriver.getTitle();
		String expectedTitle="Facebook";
		System.out.println(expectedTitle.equals(actualTitle));
	
		wdriver.close();
	}
}
