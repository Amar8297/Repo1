package day6.webdrivermanagersetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerSetupForFirefox {
		public static void main(String[] args) {
	//		String driverPath = System.getProperty("user.dir") + "\\executables\\geckodriver.exe";
//			//step1: set driver executable path by using System.setProperty(String key,String value)
//			System.setProperty("webdriver.gecko.driver", driverPath);
						
				
			WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver = new FirefoxDriver();
			//maximize browser
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("http://demo.automationtesting.in/Register.html");
			
			driver.close();
		}
}
