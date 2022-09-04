package day1.openBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	public static void main(String[] args) {
		OpenBrowser Ob=new OpenBrowser();
		Ob.OpenChrome();
		Ob.OpenFireFox();
	}
	static void OpenChrome() {
		System.setProperty("webdriver.chrome.driver","D:\\Java Practise\\SeleniumBasic\\Executables\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.google.co.in");
	}
	static void OpenFireFox() {
		System.setProperty("webdriver.gecko.driver","D:\\Java Practise\\SeleniumBasic\\Executables\\geckodriver.exe");
		FirefoxDriver Fd=new FirefoxDriver();
		Fd.get("https://www.google.com");
	}

}
