package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("http://automationpractice.com/index.php");
		
		//maximize web page window
		driver.manage().window().maximize(); 
		
		//Locator by id
		WebElement searchbox = driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys("T-shirt");
		
		//Locator by name
		driver.findElement(By.name("submit_search")).click(); 
		
		//Locator by linkText
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
		//Locator by partcialLinkText
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		
		//class and tagname is used to find more than 1 elements
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		System.out.println("Test Successful");

	}

}
