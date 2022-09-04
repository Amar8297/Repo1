package day1.openBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowser {
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Java Practise\\SeleniumBasic\\Executables\\geckodriver.exe" );
			FirefoxDriver fr=new FirefoxDriver();
			fr.get("https://www.google.com");
			
			fr.get("https://www.geeksforgeeks.org/java-unary-operator-with-examples/");
			fr.close();
			FirefoxDriver fr1=new FirefoxDriver();
			fr1.get("https://www.javatpoint.com/object-and-class-in-java");
			
		}
}
