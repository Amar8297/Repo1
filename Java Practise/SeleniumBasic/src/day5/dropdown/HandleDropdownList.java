package day5.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownList {
	public static void main(String[] args) {
		String ChromePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		
		Select selectSkill=new Select(skillDropdown);
		
		System.out.println("Is dropdown is allowing you to select multiple option:"+selectSkill.isMultiple());
		
		WebElement selectedOption=selectSkill.getFirstSelectedOption();
		//String selectedOptionName=selectedOption.getText();
		//System.out.println("Already selected option name :"+selectedOptionName);
		//or
		System.out.println("Already selected option name :"+selectSkill.getFirstSelectedOption().getText());
		
		List<WebElement> options=selectSkill.getOptions();
		System.out.println("Options count is :"+options.size());
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+":"+options.get(i).getText());
		
		}
	
		selectSkill.selectByIndex(4);
		System.out.println("Already selected option name :"+selectSkill.getFirstSelectedOption().getText());
		//or
		selectSkill.selectByValue("Back Management");
		System.out.println("Already Selected options name :"+selectSkill.getFirstSelectedOption().getText());
		//or
		selectSkill.selectByVisibleText("Analytics");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
	
	}
				//or
	
	
}
