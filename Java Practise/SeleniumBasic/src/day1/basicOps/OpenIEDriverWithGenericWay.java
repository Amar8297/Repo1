package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEDriverWithGenericWay {
	public static void main(String[] args) {
		String driverPath1="D:\\Java Practise\\SeleniumBasic\\Executables\\IEDriverServer.exe";
		String driverPath2=".\\\\Executables\\\\IEDriverServer.exe";
		String driverPath3=System.getProperty("user.dir")+"\\Executables\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", driverPath3);
		WebDriver driver =new InternetExplorerDriver();
	}
}
