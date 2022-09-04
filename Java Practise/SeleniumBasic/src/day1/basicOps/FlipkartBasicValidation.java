package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBasicValidation {
	public static void main(String[] args) {
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath3);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String pageTile=driver.getTitle();
		String expecetedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("Title validation :"+pageTile.equals( expecetedTitle));
		
		String pageUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.flipkart.com";
		System.out.println("PageUrlValidation :"+pageUrl.contains(expectedUrl));
		
		/*int contentLength=driver.getPageSource().length();
		System.out.println("Content length()"+contentLength);*/
		String sourceContent=driver.getPageSource();
		System.out.println("Source content lenght:"+sourceContent.length());
		driver.close();
	}
}
