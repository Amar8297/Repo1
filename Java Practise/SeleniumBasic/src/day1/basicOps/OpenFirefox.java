package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
	public static void main(String[] args) {
		String driverPath1="D:\\Java Practise\\SeleniumBasic\\Executables\\geckodriver.exe";
		String driverPath2=".\\Executables\\\\geckodriver.exe";
		String driverPath3=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath3);
		FirefoxDriver fdriver=new FirefoxDriver();
	}
}
