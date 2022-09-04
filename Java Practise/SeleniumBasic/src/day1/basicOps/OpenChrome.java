package day1.basicOps;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		String driverPath1="D:\\JavaPractise\\SeleniumBasic\\Executables\\chromedriver.exe";
		String driverPath2=".\\executable\\chromedriver.exe";
		String driverPath3=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath3);
		ChromeDriver cdriver=new ChromeDriver();
	}}