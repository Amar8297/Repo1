package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserWithGenericWay {
	public static void main(String[] args) {
		String driverPath1="D:\\Java Practise\\SeleniumBasic\\Executables\\chromedriver.exe";
		String driverPath2=".\\executables\\chromedriver.exe";
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath3);
		WebDriver driver =new ChromeDriver();
		
	}
}
